package p153l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes9.dex */
public class cpt extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f83023a;

    /* JADX INFO: renamed from: b */
    public boolean f83024b;

    public cpt(CharSequence charSequence, boolean z) {
        this.f83023a = charSequence;
        this.f83024b = z;
    }

    /* JADX INFO: renamed from: H */
    public boolean m111828H() {
        return this.f83024b;
    }

    /* JADX INFO: renamed from: I */
    public void m111829I(boolean z) {
        this.f83024b = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193892n0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        TextView textView = (TextView) view.findViewById(ldc0.f131494P1);
        VSwitch vSwitch = (VSwitch) view.findViewById(ldc0.f131468I1);
        textView.setText(this.f83023a);
        vSwitch.setChecked(this.f83024b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: v */
    public void mo71942v(View view, @NonNull List<Object> list) {
        super.mo71942v(view, list);
        if (jyb.m147479J(list)) {
            mo71749u(view);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof j0f) {
            this.f83024b = ((j0f) obj).f117815a;
            ((VSwitch) view.findViewById(ldc0.f131468I1)).setChecked(this.f83024b);
        }
    }
}
