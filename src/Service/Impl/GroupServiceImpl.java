package Service.Impl;

import Db.Database;
import Model.Group;
import Service.GroupService;

import javax.xml.crypto.Data;
import java.util.List;

public class GroupServiceImpl implements GroupService {
 Database dataBase = new Database();
    @Override
    public String addNewGroup(Group group) {
         dataBase.getGroups().add(group);
         return "group";
    }

    @Override
    public String getGroupById(int id) {
        dataBase.getGroups().stream().filter(x->x.getId() == id);
        return "ok";
    }

    @Override
    public List<Group> getAllGroups() {
        return getAllGroups();
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
