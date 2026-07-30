package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LabelParams;
import com.p046p1.mobile.putong.core.newui.messages.ColorTrackTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class r66 extends dac0<LabelParams> {

    /* JADX INFO: renamed from: c */
    public List<LabelParams> f157897c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<String> f157898d;

    /* JADX INFO: renamed from: e */
    public final w9j<String, Boolean> f157899e;

    public r66(@NonNull e30<String> e30Var, @NonNull w9j<String, Boolean> w9jVar) {
        this.f157898d = e30Var;
        this.f157899e = w9jVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f157897c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return ((Act) viewGroup.getContext()).inflater().inflate(f6c0.f95300C1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final LabelParams labelParams, int i, int i2) {
        ColorTrackTextView colorTrackTextView = (ColorTrackTextView) view.findViewById(u4c0.f174548x6);
        colorTrackTextView.setText(labelParams.value);
        boolean zM194847z = upa.m194847z();
        if (this.f157899e.call(labelParams.key).booleanValue()) {
            if (zM194847z) {
                colorTrackTextView.m40593t(Color.parseColor(Constants.BLACK), 0);
                view.setBackgroundResource(x2c0.f189168Ae);
            } else {
                colorTrackTextView.m40593t(Color.parseColor("#FE7E1D"), 0);
                view.setBackgroundResource(x2c0.f189391He);
            }
        } else if (zM194847z) {
            colorTrackTextView.m40593t(Color.parseColor("#66000000"), 0);
            view.setBackgroundResource(x2c0.f189200Be);
        } else {
            colorTrackTextView.m40593t(Color.parseColor("#33000000"), 0);
            view.setBackgroundResource(x2c0.f189391He);
        }
        xdl0.m208329E0(view.findViewById(u4c0.f174514v6), new View.OnClickListener() { // from class: l.q66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f152853a.m178046I(labelParams, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<LabelParams> m178044G() {
        return this.f157897c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public LabelParams getItem(int i) {
        return this.f157897c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m178046I(LabelParams labelParams, View view) {
        this.f157898d.call(labelParams.key);
    }

    /* JADX INFO: renamed from: J */
    public void m178047J(List<LabelParams> list) {
        if (list == null || vwb.m200296J(list)) {
            return;
        }
        this.f157897c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
