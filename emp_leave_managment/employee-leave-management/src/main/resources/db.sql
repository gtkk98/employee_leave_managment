CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    role VARCHAR(50) -- Employee / Manager
);

CREATE TABLE leave_request (
    id SERIAL PRIMARY KEY,
    employee_id INT,
    leave_type VARCHAR(100),
    start_date DATE,
    end_date DATE,
    status VARCHAR(50), -- Pending / Approved / Rejected
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);