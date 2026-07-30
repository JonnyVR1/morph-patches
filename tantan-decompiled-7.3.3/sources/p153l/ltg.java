package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ltg extends ptg {
    public ltg(Act act, mtg mtgVar, FeedCenterImageView feedCenterImageView) {
        super(act, mtgVar, feedCenterImageView);
    }

    @Override // p153l.ptg
    /* JADX INFO: renamed from: c */
    public void mo142037c(int i, final Moment moment, final HashMap<String, Boolean> map) {
        FeedCenterImageView feedCenterImageView = this.f154063s;
        int i2 = FeedCenterImageView.f42665F;
        int i3 = feedCenterImageView.f42666B;
        boolean z = false;
        m173768b(this.f154053i, false);
        m173768b(this.f154056l, false);
        m173768b(this.f154055k, false);
        m173768b(this.f154052h, !TextUtils.isEmpty(moment.value));
        m173768b(this.f154048d, false);
        Boolean bool = map.get(moment.f56859id);
        VExpandableTextContainer vExpandableTextContainer = this.f154052h;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        vExpandableTextContainer.m80383L(z).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.jtg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z2) {
                this.f122587a.m155783k(map, moment, z2);
            }
        }).m80384M(moment.value);
        m173768b(this.f154054j, true);
        Picture pictureM155778f = m155778f(moment);
        if (pictureM155778f != null) {
            m155780h();
            m155784l(moment);
            TextUtils.equals(this.f154068x, "from_discover_dating");
            m155786n();
            m155785m(moment, i2, i3, pictureM155778f);
            rtg.m183120f(moment, this.f154060p);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Picture m155778f(Moment moment) {
        Cloneable cloneable = moment.live.snapshot;
        if (cloneable == null) {
            cloneable = (NullChecker.m82486a(moment.liveRoom) && NullChecker.m82486a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
        }
        if (cloneable instanceof Picture) {
            return (Picture) cloneable;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m155779g(Moment moment) {
        return (jyb.m147479J(moment.live.specialLabels) || TextUtils.isEmpty(moment.live.specialLabels.get(0).value)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m155780h() {
        for (int i = 0; i < this.f154054j.getChildCount(); i++) {
            if (this.f154054j.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) this.f154054j.getChildAt(i);
                m173768b(vRelative, false);
                View childAt = vRelative.getChildAt(0);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    uqb0.f180374G.m98798o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                m173768b(vRelative.getChildAt(1), false);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m155781i(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return liveMultiCallInfo != null && liveMultiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m155782j(Moment moment, View view) {
        rtg.m183116b(this.f154062r, this.f154068x, moment, this.f154070z, this.f154069y, this.f154044A);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m155783k(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        this.f154063s.m65824O(z);
    }

    /* JADX INFO: renamed from: l */
    public final void m155784l(Moment moment) {
        VText vText = this.f154058n;
        if (m155779g(moment)) {
            vText.setText(moment.live.specialLabels.get(0).value);
        } else if (moment.isLiveDataChange()) {
            vText.setText(m155781i(moment) ? R$string.f39897e3 : R$string.f39883c3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m155785m(final Moment moment, int i, int i2, Picture picture) {
        VRelative vRelative = (VRelative) this.f154054j.getChildAt(0);
        if (vRelative.getChildCount() < 2) {
            return;
        }
        View childAt = vRelative.getChildAt(0);
        bnl0.m105524M(vRelative.getChildAt(1), false);
        if (childAt instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) childAt;
            bnl0.m105525M0(vRelative, true);
            Dimension dimensionM173767a = m173767a(picture);
            vRelative.setLayoutParams(new FrameLayout.LayoutParams(dimensionM173767a.width, dimensionM173767a.height));
            vDraweeView.getHierarchy().m207045H(RoundingParams.m8303c(ksg.m151240y()).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.ktg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128689a.m155782j(moment, view);
                }
            });
            if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
                return;
            }
            uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(qa00.m175859d(i) + (i2 * 2)));
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m155786n() {
        m173768b(this.f154056l, true);
        this.f154059o.loadAnimWithListener("feed_live_room_icon.svga", -1, null, true);
    }
}
