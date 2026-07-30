package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.OfficialAdvertData;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x250 extends o0n {
    @Override // p006l.o0n
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
        if (CoreModule.f1534c.f3548D1.getAdvertData() != null) {
            m27146m(act, viewGroup, CoreModule.f1534c.f3548D1.getAdvertData());
        } else {
            viewGroup.addView(View.inflate(act, f6c0.f12473w3, null));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m27145l(String str, Act act) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            act.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m27146m(final Act act, ViewGroup viewGroup, final OfficialAdvertData officialAdvertData) {
        View viewInflate = View.inflate(act, f6c0.f11700B3, null);
        viewGroup.addView(viewInflate);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f22702O);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f22939c5);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f23001g);
        VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(u4c0.f23323z);
        Button button = (Button) viewInflate.findViewById(u4c0.f23018h);
        xdl0.H0(textView, officialAdvertData.titleText);
        xdl0.H0(textView2, officialAdvertData.desc);
        xdl0.H0(button, officialAdvertData.buttonText);
        m27148o(vDraweeView, officialAdvertData.advertLogo);
        m27148o(vDraweeView2, officialAdvertData.advertPic);
        xdl0.E0(button, new View.OnClickListener() { // from class: l.w250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24762a.m27147n(officialAdvertData, act, view);
            }
        });
        CoreModule.f1534c.f3548D1.m17268l3(officialAdvertData.advertId);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m27147n(OfficialAdvertData officialAdvertData, Act act, View view) {
        zvf0.u("e_messages_ad", "p_messages_ad", new j760[]{vwb.Y("ixxn_ad_channel", "tantan"), vwb.Y("ad_id", officialAdvertData.advertId)});
        m27145l(officialAdvertData.buttonUrl, act);
    }

    /* JADX INFO: renamed from: o */
    public final void m27148o(VDraweeView vDraweeView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f19782G.m12769Z0(vDraweeView, str);
    }
}
