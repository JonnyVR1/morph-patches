package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class i90 extends AbstractC15503a<k90> {

    /* JADX INFO: renamed from: c */
    public cg4 f112092c;

    /* JADX INFO: renamed from: d */
    public boolean f112093d = false;

    public i90(cg4 cg4Var) {
        this.f112092c = cg4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m135001y(View view) {
        this.f112092c.m106691v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m135002z(k90 k90Var, View view) {
        this.f112092c.m106676J().m183793u0(k90Var);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.f112093d) {
            return i == 0 ? 0 : 2;
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f112092c.getAct().inflater().inflate(o6c0.f142241m4, viewGroup, false);
        }
        cg4 cg4Var = this.f112092c;
        return i == 1 ? cg4Var.getAct().inflater().inflate(o6c0.f142328z0, viewGroup, false) : cg4Var.getAct().inflater().inflate(o6c0.f142248n4, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<k90> mo20404p() {
        return this.f112092c.m106676J().m183782h0();
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f38895F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.e90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f89907a.m135001y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(b5c0.f73491J0);
            TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f73488I0);
            textView.setText(mo20404p().get(i2).m144984c());
            textView2.setText(mo20404p().get(i2).m144982a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.g90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f101537a.m135002z(k90Var, view2);
                }
            });
        }
    }
}
