document.addEventListener("DOMContentLoaded", function() {
    // Fetch the list of artists from the backend
    fetch("/api/artists")
        .then(response => response.json())
        .then(data => {
            const artistList = document.getElementById("artist-list");

            // Loop through the artists and create list items
            data.forEach(artist => {
                const listItem = document.createElement("li");
                listItem.textContent = artist.name;
                artistList.appendChild(listItem);
            });
        });

    // Fetch the list of songs from the backend
    fetch("/api/songs")
        .then(response => response.json())
        .then(data => {
            const songList = document.getElementById("song-list");

            // Loop through the songs and create list items
            data.forEach(song => {
                const listItem = document.createElement("li");
                listItem.textContent = song.title;
                songList.appendChild(listItem);
            });
        });
});
