package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.OfficialAdvertData;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class x250 extends o0n {
    @Override // p149l.o0n
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
        if (CoreModule.f17545c.f19559D1.getAdvertData() != null) {
            m206842m(act, viewGroup, CoreModule.f17545c.f19559D1.getAdvertData());
        } else {
            viewGroup.addView(View.inflate(act, f6c0.f96059w3, null));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m206841l(String str, Act act) {
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
    public final void m206842m(final Act act, ViewGroup viewGroup, final OfficialAdvertData officialAdvertData) {
        View viewInflate = View.inflate(act, f6c0.f95286B3, null);
        viewGroup.addView(viewInflate);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173954O);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174191c5);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f174253g);
        VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(u4c0.f174575z);
        Button button = (Button) viewInflate.findViewById(u4c0.f174270h);
        xdl0.m208335H0(textView, officialAdvertData.titleText);
        xdl0.m208335H0(textView2, officialAdvertData.desc);
        xdl0.m208335H0(button, officialAdvertData.buttonText);
        m206844o(vDraweeView, officialAdvertData.advertLogo);
        m206844o(vDraweeView2, officialAdvertData.advertPic);
        xdl0.m208329E0(button, new View.OnClickListener() { // from class: l.w250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184088a.m206843n(officialAdvertData, act, view);
            }
        });
        CoreModule.f17545c.f19559D1.m139630l3(officialAdvertData.advertId);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m206843n(OfficialAdvertData officialAdvertData, Act act, View view) {
        zvf0.m220399u("e_messages_ad", "p_messages_ad", vwb.m200311Y("ixxn_ad_channel", "tantan"), vwb.m200311Y("ad_id", officialAdvertData.advertId));
        m206841l(officialAdvertData.buttonUrl, act);
    }

    /* JADX INFO: renamed from: o */
    public final void m206844o(VDraweeView vDraweeView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f154691G.m102356Z0(vDraweeView, str);
    }
}
