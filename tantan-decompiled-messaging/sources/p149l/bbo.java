package p149l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapPreviewBaseAct;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class bbo extends jq2<ebo> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f74862a;

    public bbo(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m100990i0(Bundle bundle) {
        IntlMapPreviewBaseAct intlMapPreviewBaseActM115511d = ((ebo) this.viewModel).act();
        MessageLocation messageLocation = this.f74862a;
        DoublePair doublePair = messageLocation.coordinates;
        intlMapPreviewBaseActM115511d.mo35965Z1(messageLocation, doublePair.first, doublePair.second);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.abo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68735a.m100990i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m100991f0() {
        try {
            act().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + this.f74862a.coordinates.first + Constants.SEPARATOR_COMMA + this.f74862a.coordinates.second)));
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("IntlMapPreviewAct onMarkerClick " + e.getMessage(), e));
            return true;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m100992g0() {
        try {
            m100994j0();
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m100991f0();
            return true;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m100993h0(MessageLocation messageLocation) {
        this.f74862a = messageLocation;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m100994j0() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?f=d&daddr=" + this.f74862a.coordinates.first + Constants.SEPARATOR_COMMA + this.f74862a.coordinates.second + "&dirflg=d&layer=t"));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        act().startActivity(intent);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
