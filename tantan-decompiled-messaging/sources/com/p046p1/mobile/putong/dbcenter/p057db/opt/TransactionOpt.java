package com.p046p1.mobile.putong.dbcenter.p057db.opt;

import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.d30;
import p149l.er4;
import p149l.j760;
import p149l.orh0;

/* JADX INFO: loaded from: classes12.dex */
public class TransactionOpt extends HashMap<String, List<er4>> {
    public ArrayList<j760<d30, d30>> tickSynced = new ArrayList<>();

    private <T> void add(orh0 orh0Var, er4 er4Var) {
        String str = orh0Var.f145283d;
        List<er4> arrayList = get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            put(str, arrayList);
        }
        arrayList.add(er4Var);
    }

    public <T extends DbObject> void delete(orh0 orh0Var, T t) {
        add(orh0Var, new er4(0, t, null));
    }

    public <T extends DbObject> void insert(orh0 orh0Var, T t) {
        add(orh0Var, new er4(1, t, null));
    }

    public <T extends DbObject> void joinUpdate(orh0 orh0Var, T t, T t2) {
        add(orh0Var, new er4(3, t, t2));
    }

    public <T extends DbObject> void update(orh0 orh0Var, T t, T t2) {
        add(orh0Var, new er4(2, t, t2));
    }
}
