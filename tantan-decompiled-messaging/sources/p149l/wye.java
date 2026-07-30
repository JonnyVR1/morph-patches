package p149l;

import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class wye extends d1q<LinearLayout> {

    /* JADX INFO: renamed from: a */
    public String f188556a;

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LinearLayout linearLayout) {
        super.mo70566u(linearLayout);
        ((TextView) linearLayout.findViewById(g5c0.f100699G6)).setText(this.f188556a);
    }

    /* JADX INFO: renamed from: I */
    public wye m206098I(String str) {
        this.f188556a = str;
        return this;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167975B3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return jn70.f118828s;
    }
}
