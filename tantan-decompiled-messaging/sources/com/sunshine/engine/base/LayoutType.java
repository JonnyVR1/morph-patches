package com.sunshine.engine.base;

import com.p046p1.mobile.putong.core.data.StickStatus;
import p149l.yy0;

/* JADX INFO: loaded from: classes13.dex */
public enum LayoutType {
    center("center", new InterfaceC13483a() { // from class: com.sunshine.engine.base.n
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13483a
        /* JADX INFO: renamed from: a */
        public final void mo80948a(AbstractC13484a abstractC13484a) {
            LayoutType.m80946f(abstractC13484a);
        }
    }),
    top(StickStatus.top, new InterfaceC13483a() { // from class: com.sunshine.engine.base.o
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13483a
        /* JADX INFO: renamed from: a */
        public final void mo80948a(AbstractC13484a abstractC13484a) {
            abstractC13484a.f55662j.f200687d = abstractC13484a.f55661i.f200687d;
        }
    }),
    bottom("bottom", new InterfaceC13483a() { // from class: com.sunshine.engine.base.p
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13483a
        /* JADX INFO: renamed from: a */
        public final void mo80948a(AbstractC13484a abstractC13484a) {
            LayoutType.m80944a(abstractC13484a);
        }
    }),
    match_height("match_height", new InterfaceC13483a() { // from class: com.sunshine.engine.base.q
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13483a
        /* JADX INFO: renamed from: a */
        public final void mo80948a(AbstractC13484a abstractC13484a) {
            LayoutType.m80945b(abstractC13484a);
        }
    });

    private final InterfaceC13483a callback;
    private final String text;

    /* JADX INFO: renamed from: com.sunshine.engine.base.LayoutType$a */
    public interface InterfaceC13483a {
        /* JADX INFO: renamed from: a */
        void mo80948a(AbstractC13484a abstractC13484a);
    }

    LayoutType(String str, InterfaceC13483a interfaceC13483a) {
        this.text = str;
        this.callback = interfaceC13483a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80944a(AbstractC13484a abstractC13484a) {
        yy0 yy0Var = abstractC13484a.f55662j;
        yy0 yy0Var2 = abstractC13484a.f55661i;
        yy0Var.f200687d = (yy0Var2.f200690g - yy0Var.f200690g) + yy0Var2.f200687d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80945b(AbstractC13484a abstractC13484a) {
        float fIntValue = (abstractC13484a.f55661i.f200690g * 1.0f) / abstractC13484a.f55660h.f176652b.intValue();
        abstractC13484a.f55659g = fIntValue;
        abstractC13484a.f55662j.f200689f = (int) (fIntValue * abstractC13484a.f55660h.f176651a.intValue());
        abstractC13484a.f55662j.f200690g = (int) (abstractC13484a.f55659g * abstractC13484a.f55660h.f176652b.intValue());
        yy0 yy0Var = abstractC13484a.f55662j;
        yy0 yy0Var2 = abstractC13484a.f55661i;
        yy0Var.f200685b = ((yy0Var2.f200689f - yy0Var.f200689f) / 2) + yy0Var2.f200685b;
        yy0Var.f200687d = yy0Var2.f200687d;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80946f(AbstractC13484a abstractC13484a) {
        yy0 yy0Var = abstractC13484a.f55662j;
        yy0 yy0Var2 = abstractC13484a.f55661i;
        yy0Var.f200687d = ((yy0Var2.f200690g - yy0Var.f200690g) / 2) + yy0Var2.f200687d;
    }

    public void resize(AbstractC13484a abstractC13484a) {
        this.callback.mo80948a(abstractC13484a);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
