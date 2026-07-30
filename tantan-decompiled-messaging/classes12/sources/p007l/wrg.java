package p007l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.HashMap;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wrg extends asg {
    public wrg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        super(act, xrgVar, feedCenterImageView);
    }

    @Override // p007l.asg
    /* JADX INFO: renamed from: c */
    public void mo8592c(int i, final Moment moment, final HashMap<String, Boolean> map) {
        FeedCenterImageView feedCenterImageView = this.f5831s;
        int i2 = FeedCenterImageView.f3278F;
        int i3 = feedCenterImageView.f3279B;
        boolean z = false;
        m8591b(this.f5821i, false);
        m8591b(this.f5824l, false);
        m8591b(this.f5823k, false);
        m8591b(this.f5820h, !TextUtils.isEmpty(moment.value));
        m8591b(this.f5816d, false);
        Boolean bool = map.get(((DbObject) moment).id);
        VExpandableTextContainer vExpandableTextContainer = this.f5820h;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        vExpandableTextContainer.L(z).Q(new VExpandableTextContainer.e() { // from class: l.urg
            /* JADX INFO: renamed from: a */
            public final void m15130a(boolean z2) {
                this.f13920a.m15914k(map, moment, z2);
            }
        }).M(moment.value);
        m8591b(this.f5822j, true);
        Picture pictureM15909f = m15909f(moment);
        if (pictureM15909f != null) {
            m15911h();
            m15915l(moment);
            TextUtils.equals(this.f5836x, "from_discover_dating");
            m15917n();
            m15916m(moment, i2, i3, pictureM15909f);
            csg.m9241f(moment, this.f5828p);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Picture m15909f(Moment moment) {
        Cloneable cloneable = moment.live.snapshot;
        if (cloneable == null) {
            cloneable = (NullChecker.a(moment.liveRoom) && NullChecker.a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
        }
        if (cloneable instanceof Picture) {
            return (Picture) cloneable;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15910g(Moment moment) {
        return (vwb.J(moment.live.specialLabels) || TextUtils.isEmpty(moment.live.specialLabels.get(0).value)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m15911h() {
        for (int i = 0; i < this.f5822j.getChildCount(); i++) {
            if (this.f5822j.getChildAt(i) instanceof VRelative) {
                VRelative childAt = this.f5822j.getChildAt(i);
                m8591b(childAt, false);
                VDraweeView childAt2 = childAt.getChildAt(0);
                if (childAt2 instanceof VDraweeView) {
                    VDraweeView vDraweeView = childAt2;
                    qib0.G.o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt2.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey((String) null);
                }
                m8591b(childAt.getChildAt(1), false);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15912i(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return liveMultiCallInfo != null && liveMultiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m15913j(Moment moment, View view) {
        csg.m9237b(this.f5830r, this.f5836x, moment, this.f5838z, this.f5837y, this.f5812A);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m15914k(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        this.f5831s.m5735O(z);
    }

    /* JADX INFO: renamed from: l */
    public final void m15915l(Moment moment) {
        VText vText = this.f5826n;
        if (m15910g(moment)) {
            vText.setText(moment.live.specialLabels.get(0).value);
        } else if (moment.isLiveDataChange()) {
            vText.setText(m15912i(moment) ? R$string.f510e3 : R$string.f496c3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15916m(final Moment moment, int i, int i2, Picture picture) {
        VRelative childAt = this.f5822j.getChildAt(0);
        if (childAt.getChildCount() < 2) {
            return;
        }
        VDraweeView childAt2 = childAt.getChildAt(0);
        xdl0.M(childAt.getChildAt(1), false);
        if (childAt2 instanceof VDraweeView) {
            VDraweeView vDraweeView = childAt2;
            xdl0.M0(childAt, true);
            Dimension dimensionM8590a = m8590a(picture);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionM8590a.width, dimensionM8590a.height));
            vDraweeView.getHierarchy().H(RoundingParams.c(vqg.m15551y()).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.vrg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14284a.m15913j(moment, view);
                }
            });
            if (TEnum.equals(picture.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture.url)) {
                return;
            }
            qib0.G.Q0(vDraweeView, picture.calculatedWidth(t100.d(i) + (i2 * 2)));
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15917n() {
        m8591b(this.f5824l, true);
        this.f5827o.loadAnimWithListener("feed_live_room_icon.svga", -1, (AnimListener) null, true);
    }
}
