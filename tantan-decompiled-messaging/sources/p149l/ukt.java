package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ukt implements s7m<skt> {

    /* JADX INFO: renamed from: a */
    public pkt f176958a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f176959b;

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f176960c;

    /* JADX INFO: renamed from: d */
    public skt f176961d;

    public ukt(LinearLayout linearLayout, VRecyclerView vRecyclerView) {
        this.f176959b = linearLayout;
        this.f176960c = vRecyclerView;
        int i = t100.f167259h;
        vRecyclerView.addItemDecoration(new xlf0(i, i));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(skt sktVar) {
        this.f176961d = sktVar;
    }

    /* JADX INFO: renamed from: b */
    public void m194179b(List<wq2> list) {
        xdl0.m208344M(this.f176959b, true);
        pkt pktVar = this.f176958a;
        if (pktVar != null) {
            pktVar.m170058I(list);
            return;
        }
        final skt sktVar = this.f176961d;
        Objects.requireNonNull(sktVar);
        pkt pktVar2 = new pkt(list, new e30() { // from class: l.tkt
            @Override // p149l.e30
            public final void call(Object obj) {
                sktVar.m184617K2((wq2) obj);
            }
        });
        this.f176958a = pktVar2;
        this.f176960c.setAdapter(pktVar2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
