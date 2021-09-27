package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Position;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(randomUUID().toString(), "Doe", "John", Position.CONCIERGE));
        staff.add(new StaffMember(randomUUID().toString(), "Doe", "Jane", Position.FRONT_DESK));
        staff.add(new StaffMember(randomUUID().toString(), "Handle", "Oliver", Position.SECURITY));
        staff.add(new StaffMember(randomUUID().toString(), "Smith", "Sammy", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff() { return staff; }
}
