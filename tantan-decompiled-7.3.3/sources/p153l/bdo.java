package p153l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapPreviewBaseAct;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class bdo extends ar2<edo> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f76278a;

    public bdo(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m103615i0(Bundle bundle) {
        IntlMapPreviewBaseAct intlMapPreviewBaseActM120506d = ((edo) this.viewModel).act();
        MessageLocation messageLocation = this.f76278a;
        DoublePair doublePair = messageLocation.coordinates;
        intlMapPreviewBaseActM120506d.mo36968a2(messageLocation, doublePair.first, doublePair.second);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ado
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70705a.m103615i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m103616f0() {
        try {
            act().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + this.f76278a.coordinates.first + Constants.SEPARATOR_COMMA + this.f76278a.coordinates.second)));
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("IntlMapPreviewAct onMarkerClick " + e.getMessage(), e));
            return true;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m103617g0() {
        try {
            m103619j0();
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m103616f0();
            return true;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m103618h0(MessageLocation messageLocation) {
        this.f76278a = messageLocation;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m103619j0() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?f=d&daddr=" + this.f76278a.coordinates.first + Constants.SEPARATOR_COMMA + this.f76278a.coordinates.second + "&dirflg=d&layer=t"));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        act().startActivity(intent);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
