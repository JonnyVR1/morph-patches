package p007l;

import android.text.TextPaint;
import android.view.View;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a8i implements k8i<FeedUserSexAndAgeView> {
    @Override // p007l.k8i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo8460a(FeedUserSexAndAgeView feedUserSexAndAgeView, User user) {
        xdl0.C0(feedUserSexAndAgeView.f4890a, t100.d(24.0f));
        feedUserSexAndAgeView.f4892c.setTextSize(13.0f);
        boolean zM10935v = ijb0.m10935v(user);
        VLinear vLinear = feedUserSexAndAgeView.f4890a;
        if (zM10935v) {
            xdl0.h0(vLinear, 0);
            xdl0.D0(t100.d(24.0f), new View[]{feedUserSexAndAgeView.f4890a});
        } else {
            xdl0.d0(vLinear, t100.d(6.0f));
            xdl0.e0(feedUserSexAndAgeView.f4890a, t100.d(8.0f));
            xdl0.D0(-2, new View[]{feedUserSexAndAgeView.f4890a});
        }
        TextPaint paint = feedUserSexAndAgeView.f4892c.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(false);
        }
    }
}
