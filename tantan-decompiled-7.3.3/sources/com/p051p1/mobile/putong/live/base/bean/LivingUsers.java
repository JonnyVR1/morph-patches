package com.p051p1.mobile.putong.live.base.bean;

import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.nsv;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class LivingUsers<T> extends ArrayList<nsv<T>> {
    public LivingUsers() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ nsv m68803c(qcj qcjVar, Object obj) {
        nsv nsvVarM164636f = nsv.m164636f(obj);
        return qcjVar == null ? nsvVarM164636f : (nsv) qcjVar.call(nsvVarM164636f);
    }

    public static <F> LivingUsers<F> convert(List<F> list, final qcj<nsv<F>, nsv<F>> qcjVar) {
        return new LivingUsers<>(jyb.m147522n(jyb.m147486Q(list, new qcj() { // from class: l.osv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingUsers.m68803c(qcjVar, obj);
            }
        }), new qcj() { // from class: l.psv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((nsv) obj) != null);
            }
        }));
    }

    public static <F> LivingUsers<F> create(List<nsv<F>> list) {
        return new LivingUsers<>(list);
    }

    private LivingUsers(List<nsv<T>> list) {
        super(list);
    }
}
