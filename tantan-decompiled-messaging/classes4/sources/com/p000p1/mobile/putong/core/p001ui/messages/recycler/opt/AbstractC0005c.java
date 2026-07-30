package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c;
import java.util.List;
import p002l.eqq;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0005c<T extends AbstractC0005c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$a */
    public static final class a extends AbstractC0005c<a> {
        @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c
        /* JADX INFO: renamed from: a */
        public String mo127a() {
            return "Idle";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$b */
    public static final class b extends AbstractC0005c {

        /* JADX INFO: renamed from: a */
        public List<Integer> f57a;

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c
        /* JADX INFO: renamed from: a */
        public String mo127a() {
            return "itemRequest";
        }

        /* JADX INFO: renamed from: b */
        public void m128b(List<Integer> list) {
            this.f57a = list;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$c */
    public static final class c extends AbstractC0005c {

        /* JADX INFO: renamed from: a */
        public eqq f58a;

        public c(eqq eqqVar) {
            this.f58a = eqqVar;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c
        /* JADX INFO: renamed from: a */
        public String mo127a() {
            return "jump";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$d */
    public static final class d extends AbstractC0005c {
        @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c
        /* JADX INFO: renamed from: a */
        public String mo127a() {
            return "notify";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$e */
    public static final class e extends AbstractC0005c {
        @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c
        /* JADX INFO: renamed from: a */
        public String mo127a() {
            return "scrollEnd";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo127a();
}
