package com.p051p1.mobile.putong.dbcenter.p062db.opt;

import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.ds4;
import p153l.pf60;
import p153l.wzh0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class TransactionOpt extends HashMap<String, List<ds4>> {
    public ArrayList<pf60<x20, x20>> tickSynced = new ArrayList<>();

    private <T> void add(wzh0 wzh0Var, ds4 ds4Var) {
        String str = wzh0Var.f191760d;
        List<ds4> arrayList = get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            put(str, arrayList);
        }
        arrayList.add(ds4Var);
    }

    public <T extends DbObject> void delete(wzh0 wzh0Var, T t) {
        add(wzh0Var, new ds4(0, t, null));
    }

    public <T extends DbObject> void insert(wzh0 wzh0Var, T t) {
        add(wzh0Var, new ds4(1, t, null));
    }

    public <T extends DbObject> void joinUpdate(wzh0 wzh0Var, T t, T t2) {
        add(wzh0Var, new ds4(3, t, t2));
    }

    public <T extends DbObject> void update(wzh0 wzh0Var, T t, T t2) {
        add(wzh0Var, new ds4(2, t, t2));
    }
}
