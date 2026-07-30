package p153l;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualTipItemView;

/* JADX INFO: loaded from: classes5.dex */
public class eyl0 extends d3q<VirtualTipItemView> {

    /* JADX INFO: renamed from: a */
    public String f96452a;

    /* JADX INFO: renamed from: b */
    public String f96453b;

    public eyl0(String str, String str2) {
        this.f96453b = str;
        this.f96452a = str2;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VirtualTipItemView virtualTipItemView) {
        super.mo71749u(virtualTipItemView);
        virtualTipItemView.setText(this.f96453b);
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) virtualTipItemView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0580p).height = qa00.m175859d(38.0f);
        virtualTipItemView.setLayoutParams(c0580p);
        virtualTipItemView.setTextColor(Color.parseColor("#ccffffff"));
        virtualTipItemView.setBackgroundDrawable(fc2.m124971a(Color.parseColor(VirtualChatInputTipsView.f53129k.equals(this.f96452a) ? "#33000000" : "#19191E"), qa00.m175859d(10.0f), false));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198794I6;
    }
}
