package com.p046p1.mobile.putong.live.base.bean;

import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import java.util.ArrayList;
import java.util.List;
import p149l.mqv;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class LivingUsers<T> extends ArrayList<mqv<T>> {
    public LivingUsers() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ mqv m67620c(w9j w9jVar, Object obj) {
        mqv mqvVarM155998f = mqv.m155998f(obj);
        return w9jVar == null ? mqvVarM155998f : (mqv) w9jVar.call(mqvVarM155998f);
    }

    public static <F> LivingUsers<F> convert(List<F> list, final w9j<mqv<F>, mqv<F>> w9jVar) {
        return new LivingUsers<>(vwb.m200339n(vwb.m200303Q(list, new w9j() { // from class: l.nqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingUsers.m67620c(w9jVar, obj);
            }
        }), new w9j() { // from class: l.oqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((mqv) obj) != null);
            }
        }));
    }

    public static <F> LivingUsers<F> create(List<mqv<F>> list) {
        return new LivingUsers<>(list);
    }

    private LivingUsers(List<mqv<T>> list) {
        super(list);
    }
}
