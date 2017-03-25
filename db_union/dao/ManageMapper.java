package db_union.dao;

import db_union.model.Manage;

public interface ManageMapper {
    int insert(Manage record);

    int insertSelective(Manage record);
}