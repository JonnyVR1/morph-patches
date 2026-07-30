package p003l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.map.intl.IntlMapPreviewBaseAct;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.CrashHelper;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bbo extends jq2<ebo> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f2368a;

    public bbo(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m2936i0(Bundle bundle) {
        IntlMapPreviewBaseAct intlMapPreviewBaseActM3813d = ((ebo) ((jq2) this).viewModel).act();
        MessageLocation messageLocation = this.f2368a;
        DoublePair doublePair = messageLocation.coordinates;
        intlMapPreviewBaseActM3813d.m437Z1(messageLocation, doublePair.first, doublePair.second);
    }

    /* JADX INFO: renamed from: a0 */
    public void m2937a0() {
        super.a0();
        creates(new e30() { // from class: l.abo
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2103a.m2936i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m2938f0() {
        try {
            act().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + this.f2368a.coordinates.first + "," + this.f2368a.coordinates.second)));
            return true;
        } catch (Exception e) {
            CrashHelper.c(new Exception("IntlMapPreviewAct onMarkerClick " + e.getMessage(), e));
            return true;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m2939g0() {
        try {
            m2941j0();
            return true;
        } catch (Exception e) {
            CrashHelper.c(e);
            m2938f0();
            return true;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m2940h0(MessageLocation messageLocation) {
        this.f2368a = messageLocation;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2941j0() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?f=d&daddr=" + this.f2368a.coordinates.first + "," + this.f2368a.coordinates.second + "&dirflg=d&layer=t"));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        act().startActivity(intent);
    }

    public void destroy() {
    }
}
