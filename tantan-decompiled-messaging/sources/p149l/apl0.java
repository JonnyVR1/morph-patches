package p149l;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualTipItemView;

/* JADX INFO: loaded from: classes5.dex */
public class apl0 extends d1q<VirtualTipItemView> {

    /* JADX INFO: renamed from: a */
    public String f71061a;

    /* JADX INFO: renamed from: b */
    public String f71062b;

    public apl0(String str, String str2) {
        this.f71062b = str;
        this.f71061a = str2;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VirtualTipItemView virtualTipItemView) {
        super.mo70566u(virtualTipItemView);
        virtualTipItemView.setText(this.f71062b);
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) virtualTipItemView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0578p).height = t100.m186890d(38.0f);
        virtualTipItemView.setLayoutParams(c0578p);
        virtualTipItemView.setTextColor(Color.parseColor("#ccffffff"));
        virtualTipItemView.setBackgroundDrawable(yb2.m213876a(Color.parseColor(VirtualChatInputTipsView.f52281k.equals(this.f71061a) ? "#33000000" : "#19191E"), t100.m186890d(10.0f), false));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168062I6;
    }
}
