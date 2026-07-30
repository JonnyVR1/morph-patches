package p149l;

import android.view.View;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ybs extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final String f197361a;

    /* JADX INFO: renamed from: b */
    public final String f197362b;

    public ybs(String str, String str2) {
        this.f197361a = str;
        this.f197362b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ybs ybsVar = (ybs) obj;
            if (v050.m196470a(this.f197361a, ybsVar.f197361a) && v050.m196470a(this.f197362b, ybsVar.f197362b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f197361a, this.f197362b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168470p3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        hxs.m133406s("context_single_room", (VDraweeView) view.findViewById(g5c0.f100934g1), this.f197361a);
        ((TextView) view.findViewById(g5c0.f100699G6)).setText(this.f197362b);
    }
}
