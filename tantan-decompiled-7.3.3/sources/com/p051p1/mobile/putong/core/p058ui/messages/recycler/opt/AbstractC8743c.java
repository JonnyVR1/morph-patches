package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c;
import java.util.List;
import p153l.fsq;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8743c<T extends AbstractC8743c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$a */
    public static final class a extends AbstractC8743c<a> {
        @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c
        /* JADX INFO: renamed from: a */
        public String mo50896a() {
            return "Idle";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$b */
    public static final class b extends AbstractC8743c {

        /* JADX INFO: renamed from: a */
        public List<Integer> f33083a;

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c
        /* JADX INFO: renamed from: a */
        public String mo50896a() {
            return "itemRequest";
        }

        /* JADX INFO: renamed from: b */
        public void m50897b(List<Integer> list) {
            this.f33083a = list;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$c */
    public static final class c extends AbstractC8743c {

        /* JADX INFO: renamed from: a */
        public fsq f33084a;

        public c(fsq fsqVar) {
            this.f33084a = fsqVar;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c
        /* JADX INFO: renamed from: a */
        public String mo50896a() {
            return "jump";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$d */
    public static final class d extends AbstractC8743c {
        @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c
        /* JADX INFO: renamed from: a */
        public String mo50896a() {
            return "notify";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$e */
    public static final class e extends AbstractC8743c {
        @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c
        /* JADX INFO: renamed from: a */
        public String mo50896a() {
            return "scrollEnd";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo50896a();
}
