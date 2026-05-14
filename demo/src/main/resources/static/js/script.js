// Form Validation for Contact Page
function validateForm(event) {
    event.preventDefault();
    
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    if (name === "" || email === "" || message === "") {
        alert("Mohon isi semua kolom!");
    } else {
        // Trigger Bootstrap Alert atau Native Alert
        alert("Terima kasih, " + name + "! Pesan Anda telah terkirim.");
        document.getElementById('contactForm').reset();
    }
}

// Interaksi sederhana untuk Gallery (Modal info)
function showImageInfo(projectName) {
    alert("Menampilkan detail untuk: " + projectName);
}