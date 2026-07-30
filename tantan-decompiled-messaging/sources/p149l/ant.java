package p149l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes13.dex */
public class ant extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f70767a;

    /* JADX INFO: renamed from: b */
    public boolean f70768b;

    public ant(CharSequence charSequence, boolean z) {
        this.f70767a = charSequence;
        this.f70768b = z;
    }

    /* JADX INFO: renamed from: H */
    public boolean m97813H() {
        return this.f70768b;
    }

    /* JADX INFO: renamed from: I */
    public void m97814I(boolean z) {
        this.f70768b = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162778n0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        TextView textView = (TextView) view.findViewById(f5c0.f95037P1);
        VSwitch vSwitch = (VSwitch) view.findViewById(f5c0.f95011I1);
        textView.setText(this.f70767a);
        vSwitch.setChecked(this.f70768b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: v */
    public void mo70759v(View view, @NonNull List<Object> list) {
        super.mo70759v(view, list);
        if (vwb.m200296J(list)) {
            mo70566u(view);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof fze) {
            this.f70768b = ((fze) obj).f99957a;
            ((VSwitch) view.findViewById(f5c0.f95011I1)).setChecked(this.f70768b);
        }
    }
}
