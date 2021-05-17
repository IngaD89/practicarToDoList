let taskList = document.getElementById("lista");

function addTaskList(tasks) {
    tasks.forEach(task => {
        const line = `<div class="task">
            <p class="title">(${task.title})</p>
        </div>`;
        taskList.insertAdjacentHTML("beforeend", line)
    })

}