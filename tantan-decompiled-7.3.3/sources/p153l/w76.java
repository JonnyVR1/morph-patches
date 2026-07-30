package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LabelParams;
import com.p051p1.mobile.putong.core.newui.messages.ColorTrackTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w76 extends jic0<LabelParams> {

    /* JADX INFO: renamed from: c */
    public List<LabelParams> f187706c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final y20<String> f187707d;

    /* JADX INFO: renamed from: e */
    public final qcj<String, Boolean> f187708e;

    public w76(@NonNull y20<String> y20Var, @NonNull qcj<String, Boolean> qcjVar) {
        this.f187707d = y20Var;
        this.f187708e = qcjVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f187706c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return ((Act) viewGroup.getContext()).inflater().inflate(kec0.f125351C1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final LabelParams labelParams, int i, int i2) {
        ColorTrackTextView colorTrackTextView = (ColorTrackTextView) view.findViewById(adc0.f70673z6);
        colorTrackTextView.setText(labelParams.value);
        boolean zM131778z = gra.m131778z();
        if (this.f187708e.call(labelParams.key).booleanValue()) {
            if (zM131778z) {
                colorTrackTextView.m41604t(Color.parseColor(Constants.BLACK), 0);
                view.setBackgroundResource(dbc0.f87316pf);
            } else {
                colorTrackTextView.m41604t(Color.parseColor("#FE7E1D"), 0);
                view.setBackgroundResource(dbc0.f87545wf);
            }
        } else if (zM131778z) {
            colorTrackTextView.m41604t(Color.parseColor("#66000000"), 0);
            view.setBackgroundResource(dbc0.f87349qf);
        } else {
            colorTrackTextView.m41604t(Color.parseColor("#33000000"), 0);
            view.setBackgroundResource(dbc0.f87545wf);
        }
        bnl0.m105509E0(view.findViewById(adc0.f70639x6), new View.OnClickListener() { // from class: l.v76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182728a.m205232I(labelParams, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<LabelParams> m205230G() {
        return this.f187706c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public LabelParams getItem(int i) {
        return this.f187706c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m205232I(LabelParams labelParams, View view) {
        this.f187707d.call(labelParams.key);
    }

    /* JADX INFO: renamed from: J */
    public void m205233J(List<LabelParams> list) {
        if (list == null || jyb.m147479J(list)) {
            return;
        }
        this.f187706c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
