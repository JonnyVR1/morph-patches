package com.sunshine.engine.base;

import com.p051p1.mobile.putong.core.data.StickStatus;
import p153l.fz0;

/* JADX INFO: loaded from: classes11.dex */
public enum LayoutType {
    center("center", new InterfaceC13646a() { // from class: com.sunshine.engine.base.n
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13646a
        /* JADX INFO: renamed from: a */
        public final void mo82131a(AbstractC13647a abstractC13647a) {
            LayoutType.m82129f(abstractC13647a);
        }
    }),
    top(StickStatus.top, new InterfaceC13646a() { // from class: com.sunshine.engine.base.o
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13646a
        /* JADX INFO: renamed from: a */
        public final void mo82131a(AbstractC13647a abstractC13647a) {
            abstractC13647a.f56510j.f101433d = abstractC13647a.f56509i.f101433d;
        }
    }),
    bottom("bottom", new InterfaceC13646a() { // from class: com.sunshine.engine.base.p
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13646a
        /* JADX INFO: renamed from: a */
        public final void mo82131a(AbstractC13647a abstractC13647a) {
            LayoutType.m82127a(abstractC13647a);
        }
    }),
    match_height("match_height", new InterfaceC13646a() { // from class: com.sunshine.engine.base.q
        @Override // com.sunshine.engine.base.LayoutType.InterfaceC13646a
        /* JADX INFO: renamed from: a */
        public final void mo82131a(AbstractC13647a abstractC13647a) {
            LayoutType.m82128b(abstractC13647a);
        }
    });

    private final InterfaceC13646a callback;
    private final String text;

    /* JADX INFO: renamed from: com.sunshine.engine.base.LayoutType$a */
    public interface InterfaceC13646a {
        /* JADX INFO: renamed from: a */
        void mo82131a(AbstractC13647a abstractC13647a);
    }

    LayoutType(String str, InterfaceC13646a interfaceC13646a) {
        this.text = str;
        this.callback = interfaceC13646a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82127a(AbstractC13647a abstractC13647a) {
        fz0 fz0Var = abstractC13647a.f56510j;
        fz0 fz0Var2 = abstractC13647a.f56509i;
        fz0Var.f101433d = (fz0Var2.f101436g - fz0Var.f101436g) + fz0Var2.f101433d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82128b(AbstractC13647a abstractC13647a) {
        float fIntValue = (abstractC13647a.f56509i.f101436g * 1.0f) / abstractC13647a.f56508h.f90385b.intValue();
        abstractC13647a.f56507g = fIntValue;
        abstractC13647a.f56510j.f101435f = (int) (fIntValue * abstractC13647a.f56508h.f90384a.intValue());
        abstractC13647a.f56510j.f101436g = (int) (abstractC13647a.f56507g * abstractC13647a.f56508h.f90385b.intValue());
        fz0 fz0Var = abstractC13647a.f56510j;
        fz0 fz0Var2 = abstractC13647a.f56509i;
        fz0Var.f101431b = ((fz0Var2.f101435f - fz0Var.f101435f) / 2) + fz0Var2.f101431b;
        fz0Var.f101433d = fz0Var2.f101433d;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m82129f(AbstractC13647a abstractC13647a) {
        fz0 fz0Var = abstractC13647a.f56510j;
        fz0 fz0Var2 = abstractC13647a.f56509i;
        fz0Var.f101433d = ((fz0Var2.f101436g - fz0Var.f101436g) / 2) + fz0Var2.f101433d;
    }

    public void resize(AbstractC13647a abstractC13647a) {
        this.callback.mo82131a(abstractC13647a);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
