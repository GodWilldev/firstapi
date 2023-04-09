package com.openclassrooms.firstapi;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.openclassrooms.firstapi.controller.EmployeeController;
import com.openclassrooms.firstapi.service.EmployeeService;

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testUnitGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk());
    }

}
