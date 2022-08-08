function validate(){
  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;

          if(username.length== 0 || password.length == 0){
              alert("Username or Password cannot be blank");
              return false;
          }
          else if(username === password){
              alert("Login Succesfull")
              return true;
          }
          else{
              alert("Retry username not mathing with password")
              return false;
          }
        }

//       }
// // const url = "https://hookb.in/MqgdPmyrGouDo6VDOm6N";
// const url = "http://localhost:5500"
// const formEl = document.querySelector("form");
// formEl.addEventListener("submit", async (e) =>{
//    e.preventDefault()
   
//   const formData = new FormData(formEl);
//   const formDataSerialized=Object.fromEntries(formData);
//   console.log(formDataSerialized, "formDataSerialized");
//   const jsonObject = {
//       ...formDataSerialized}

//   try {
//       const response = await fetch(url, {
//         method: "POST",
//         body: JSON.stringify(jsonObject),
//         headers: {
//           "Content-Type": "application/json",
//         },
//       });
//       const json = await response.json();
//       console.log(json);
//     } catch (e) {
//       console.error(e);
//       alert("there as an error");
//     }

// });
