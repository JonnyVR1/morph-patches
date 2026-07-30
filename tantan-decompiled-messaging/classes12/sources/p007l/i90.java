package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.R$string;
import java.util.List;
import l.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i90 extends a<k90> {

    /* JADX INFO: renamed from: c */
    public cg4 f8965c;

    /* JADX INFO: renamed from: d */
    public boolean f8966d = false;

    public i90(cg4 cg4Var) {
        this.f8965c = cg4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m10836y(View view) {
        this.f8965c.m9166v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m10837z(k90 k90Var, View view) {
        this.f8965c.m9150J().m14144u0(k90Var);
    }

    public int getItemViewType(int i) {
        if (this.f8966d) {
            return i == 0 ? 0 : 2;
        }
        return 1;
    }

    public int getViewTypeCount() {
        return 3;
    }

    /* JADX INFO: renamed from: m */
    public View m10839m(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f8965c.act().inflater().inflate(o6c0.f11260m4, viewGroup, false);
        }
        cg4 cg4Var = this.f8965c;
        return i == 1 ? cg4Var.act().inflater().inflate(o6c0.f11347z0, viewGroup, false) : cg4Var.act().inflater().inflate(o6c0.f11267n4, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<k90> m10840p() {
        return this.f8965c.m9150J().m14133h0();
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m10838j(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f356F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.e90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7254a.m10836y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(b5c0.f5972J0);
            TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f5969I0);
            textView.setText(m10840p().get(i2).m11398c());
            textView2.setText(m10840p().get(i2).m11396a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.g90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8393a.m10837z(k90Var, view2);
                }
            });
        }
    }
}
