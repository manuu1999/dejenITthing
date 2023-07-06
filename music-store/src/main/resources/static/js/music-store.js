// music-store.js

function redirectToUpload() {
  location.href = "upload.html";
}

// Function to handle the form submission
function handleFormSubmit(event) {
  event.preventDefault(); // Prevent the default form submission

  // Get the form data
  const form = event.target;
  const formData = new FormData(form);

  // Send the form data via AJAX
  fetch("/songs", {
    method: "POST",
    body: formData
  })
    .then(response => response.json())
    .then(data => {
      // Handle the response data
      console.log("Song created:", data);
      // Redirect to the index page or perform any other actions
      location.href = "index.html";
    })
    .catch(error => {
      console.error("Error:", error);
      // Handle the error or display an error message to the user
    });
}

// Add event listener to the form submission
const uploadForm = document.getElementById("upload-form");
if (uploadForm) {
  uploadForm.addEventListener("submit", handleFormSubmit);
}
