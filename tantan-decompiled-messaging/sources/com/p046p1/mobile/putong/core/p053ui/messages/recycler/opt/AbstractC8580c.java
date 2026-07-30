package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c;
import java.util.List;
import p149l.eqq;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8580c<T extends AbstractC8580c> {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$a */
    public static final class a extends AbstractC8580c<a> {
        @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c
        /* JADX INFO: renamed from: a */
        public String mo49713a() {
            return "Idle";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$b */
    public static final class b extends AbstractC8580c {

        /* JADX INFO: renamed from: a */
        public List<Integer> f32235a;

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c
        /* JADX INFO: renamed from: a */
        public String mo49713a() {
            return "itemRequest";
        }

        /* JADX INFO: renamed from: b */
        public void m49714b(List<Integer> list) {
            this.f32235a = list;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$c */
    public static final class c extends AbstractC8580c {

        /* JADX INFO: renamed from: a */
        public eqq f32236a;

        public c(eqq eqqVar) {
            this.f32236a = eqqVar;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c
        /* JADX INFO: renamed from: a */
        public String mo49713a() {
            return "jump";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$d */
    public static final class d extends AbstractC8580c {
        @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c
        /* JADX INFO: renamed from: a */
        public String mo49713a() {
            return "notify";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.c$e */
    public static final class e extends AbstractC8580c {
        @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c
        /* JADX INFO: renamed from: a */
        public String mo49713a() {
            return "scrollEnd";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo49713a();
}
