package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ODiamondFeed;
import com.p051p1.mobile.putong.core.data.ODiamondFeedLatestVisitor;
import com.p051p1.mobile.putong.core.data.ODiamondFeedType;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0014\u00107\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u00109\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00101¨\u0006:"}, m88121d2 = {"Ll/g9y;", "Ll/bzl;", "<init>", "()V", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "j", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/data/User;", "user", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/CharSequence;", "", "currentTime", "", "deadLineTime", "k", "(JD)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "visitorUser", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "oDiamondFeed", "I", "ONE_MINUTE", "ONE_HOUR", "e", "ONE_DAY", "ONE_WEAK", "ONE_MONTH", "h", "ONE_YEAR", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g9y implements bzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User visitorUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ODiamondFeed oDiamondFeed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int ONE_MINUTE = 60;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int ONE_HOUR;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int ONE_DAY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int ONE_WEAK;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int ONE_MONTH;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int ONE_YEAR;

    public g9y() {
        int i = 60 * 60;
        this.ONE_HOUR = i;
        this.ONE_DAY = i * 24;
        this.ONE_WEAK = i * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
        this.ONE_MONTH = i * 720;
        this.ONE_YEAR = i * 8760;
    }

    /* JADX INFO: renamed from: h */
    public static void m129680h(g9y g9yVar, BusinessConversationView businessConversationView, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", g9yVar.mo107170d()));
        businessConversationView.getContext().startActivity(MeetAct.m41505Z1(businessConversationView.getContext(), "", Visitor.TYPE));
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: a */
    public void mo107167a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor2;
        viewModel.getClass();
        _view.getClass();
        int i = 0;
        bnl0.m105524M(_view.f26477i, false);
        bnl0.m105558h0(_view.f26476h, qa00.m175859d(7.0f));
        _view.f26476h.setBackgroundResource(dbc0.f86663Ve);
        if (m129682j()) {
            boolean zM131778z = gra.m131778z();
            VImage vImage = _view.f26489u;
            if (zM131778z) {
                vImage.setImageResource(dbc0.f86601Tg);
            } else {
                vImage.setImageResource(dbc0.f86824af);
            }
            bnl0.m105524M(_view.f26489u, true);
            ODiamondFeed oDiamondFeed = this.oDiamondFeed;
            if (oDiamondFeed == null || !oDiamondFeed.redDot) {
                bnl0.m105524M(_view.f26494z, false);
            } else {
                ViewGroup.LayoutParams layoutParams = _view.f26494z.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = -2;
                    marginLayoutParams.height = qa00.f156330q;
                    marginLayoutParams.topMargin = -qa00.f156319f;
                    _view.f26494z.setLayoutParams(marginLayoutParams);
                }
                _view.f26494z.setMinWidth(qa00.f156330q);
                _view.f26494z.setBackgroundResource(dbc0.f86654V5);
                VText vText = _view.f26494z;
                ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
                if (oDiamondFeed2 != null && (oDiamondFeedLatestVisitor2 = oDiamondFeed2.latestVisitor) != null) {
                    i = oDiamondFeedLatestVisitor2.visitCount;
                }
                vText.setText(c17.m107524q0(i));
                bnl0.m105524M(_view.f26494z, true);
            }
            bnl0.m105524M(_view.f26471A, true);
            VText vText2 = _view.f26471A;
            long jM174454o = pzi0.m174454o();
            ODiamondFeed oDiamondFeed3 = this.oDiamondFeed;
            vText2.setText(m129683k(jM174454o, (oDiamondFeed3 == null || (oDiamondFeedLatestVisitor = oDiamondFeed3.latestVisitor) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : oDiamondFeedLatestVisitor.latestVisitTime));
        } else {
            boolean zM131778z2 = gra.m131778z();
            VImage vImage2 = _view.f26489u;
            if (zM131778z2) {
                vImage2.setImageResource(dbc0.f86505Qg);
            } else {
                vImage2.setImageResource(dbc0.f86727Xe);
            }
            bnl0.m105524M(_view.f26489u, true);
            ODiamondFeed oDiamondFeed4 = this.oDiamondFeed;
            if (oDiamondFeed4 == null || !oDiamondFeed4.redDot) {
                bnl0.m105524M(_view.f26494z, false);
            } else {
                ViewGroup.LayoutParams layoutParams2 = _view.f26494z.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    int i2 = qa00.f156323j;
                    marginLayoutParams.width = i2;
                    marginLayoutParams.height = i2;
                    marginLayoutParams.topMargin = qa00.f156316c;
                    _view.f26494z.setLayoutParams(marginLayoutParams);
                }
                _view.f26494z.setMinWidth(qa00.f156323j);
                _view.f26494z.setText("");
                _view.f26494z.setBackgroundResource(dbc0.f86750Y5);
                bnl0.m105524M(_view.f26494z, true);
            }
            bnl0.m105524M(_view.f26471A, true);
            _view.f26471A.setText("刚刚");
        }
        bnl0.m105509E0(_view, new View.OnClickListener() { // from class: l.f9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g9y.m129680h(this.f97926a, _view, view);
            }
        });
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: b */
    public boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        ODiamondFeed oDiamondFeed = meetEntranceData.getODiamondFeed();
        if (oDiamondFeed != null) {
            List<String> list = oDiamondFeed.userIds;
            list.getClass();
            if (!list.isEmpty()) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(oDiamondFeed.userIds.get(0));
                if (userM116503Pa != null) {
                    this.visitorUser = userM116503Pa;
                    this.oDiamondFeed = oDiamondFeed;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: c */
    public boolean mo107169c() {
        return (joa.m146357G3() || this.visitorUser == null) ? false : true;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo107170d() {
        return m129682j() ? "new_visitor" : "odiamond_sayhi";
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo107171e() {
        return super.mo107171e();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: f */
    public int mo107172f() {
        return 0;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo107173g() {
        List<String> list;
        String str;
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        String str2 = null;
        if (!TextUtils.isEmpty(oDiamondFeed != null ? oDiamondFeed.subText : null)) {
            ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
            boolean zIsEmpty = TextUtils.isEmpty(oDiamondFeed2 != null ? oDiamondFeed2.highLight : null);
            ODiamondFeed oDiamondFeed3 = this.oDiamondFeed;
            if (zIsEmpty) {
                return (oDiamondFeed3 == null || (str = oDiamondFeed3.subText) == null) ? "" : str;
            }
            SpannableStringBuilder spannableStringBuilderM175797c0 = q8g0.m175797c0(oDiamondFeed3 != null ? oDiamondFeed3.subText : null, jyb.m147507f0(oDiamondFeed3 != null ? oDiamondFeed3.highLight : null), jyb.m147507f0(Integer.valueOf(mo107171e())), lyh0.m156283c(2));
            spannableStringBuilderM175797c0.getClass();
            return spannableStringBuilderM175797c0;
        }
        if (m129681i()) {
            ODiamondFeed oDiamondFeed4 = this.oDiamondFeed;
            if (!jyb.m147479J(oDiamondFeed4 != null ? oDiamondFeed4.userIds : null)) {
                dkb dkbVar = CoreModule.f18264c.f20381e0;
                ODiamondFeed oDiamondFeed5 = this.oDiamondFeed;
                if (oDiamondFeed5 != null && (list = oDiamondFeed5.userIds) != null) {
                    str2 = list.get(0);
                }
                User userM116503Pa = dkbVar.m116503Pa(str2);
                if (NullChecker.m82486a(userM116503Pa)) {
                    userM116503Pa.getClass();
                    return m129684l(userM116503Pa);
                }
            }
        }
        return "";
    }

    @Override // p153l.bzl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM61308fp;
        User user = this.visitorUser;
        if (user == null || (pictureM61308fp = user.m61308fp()) == null) {
            return null;
        }
        return pictureM61308fp.profileSmall();
    }

    @Override // p153l.bzl
    @NotNull
    public CharSequence getTitle() {
        String str;
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        if (TextUtils.isEmpty(oDiamondFeed != null ? oDiamondFeed.text : null)) {
            return m129681i() ? "一键配对" : "谁看过我";
        }
        ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
        return (oDiamondFeed2 == null || (str = oDiamondFeed2.text) == null) ? "谁看过我" : str;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m129681i() {
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        return TEnum.equals(oDiamondFeed != null ? oDiamondFeed.feedType : null, ODiamondFeedType.get("instantChat"));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m129682j() {
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        return TEnum.equals(oDiamondFeed != null ? oDiamondFeed.feedType : null, ODiamondFeedType.get(ODiamondFeedType.latestVisitor));
    }

    /* JADX INFO: renamed from: k */
    public final String m129683k(long currentTime, double deadLineTime) {
        Calendar calendar = Calendar.getInstance();
        long j = (long) deadLineTime;
        calendar.setTimeInMillis(j);
        if (calendar.get(1) <= 1970) {
            return "刚刚";
        }
        long j2 = (currentTime - j) / 1000;
        if (j2 < 60) {
            return "1分钟前";
        }
        int i = this.ONE_HOUR;
        if (j2 < i) {
            return ((int) (j2 / ((long) this.ONE_MINUTE))) + "分钟前";
        }
        int i2 = this.ONE_DAY;
        if (j2 < i2) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (j2 / ((long) i)));
            sb.append("小时前");
            return sb.toString();
        }
        int i3 = this.ONE_WEAK;
        if (j2 < i3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (j2 / ((long) i2)));
            sb2.append("天前");
            return sb2.toString();
        }
        int i4 = this.ONE_MONTH;
        if (j2 < i4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((int) (j2 / ((long) i3)));
            sb3.append("周前");
            return sb3.toString();
        }
        int i5 = this.ONE_YEAR;
        if (j2 < i5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append((int) (j2 / ((long) i4)));
            sb4.append("月前");
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append((int) (j2 / ((long) i5)));
        sb5.append("年前");
        return sb5.toString();
    }

    /* JADX INFO: renamed from: l */
    public final CharSequence m129684l(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(user.description)) {
            if (!user.isHideAgeFromSVip()) {
                Integer num = user.age;
                num.getClass();
                sb.append(num.intValue());
                sb.append("岁");
            }
            if (!user.isHideLocationFromSVip()) {
                int i = user.location.distance;
                Region region = CoreModule.f18264c.f20381e0.m116600p9().location.region;
                region.getClass();
                if (TextUtils.isEmpty(user.location.region.district) || !TextUtils.equals(region.city, user.location.region.city)) {
                    boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
                    Location location = user.location;
                    if (zIsEmpty) {
                        str = !TextUtils.isEmpty(location.region.country) ? user.location.region.country : null;
                    } else {
                        str = location.region.city;
                    }
                } else {
                    str = user.location.region.district;
                }
                if (i < 100) {
                    i = 100;
                }
                String strM107525r0 = c17.m107525r0(i);
                if (i <= 10000 || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(sb.toString())) {
                        sb.append(strM107525r0);
                    } else {
                        sb.append("、");
                        sb.append(strM107525r0);
                    }
                } else if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(str);
                } else {
                    sb.append("、");
                    sb.append(str);
                }
            }
        } else {
            sb.append(user.description);
        }
        int length = user.name.length();
        String strConcat = user.name;
        if (length > 10) {
            strConcat.getClass();
            strConcat = strConcat.substring(0, 10).concat("...");
        } else {
            strConcat.getClass();
        }
        if (TextUtils.isEmpty(sb.toString())) {
            sb.insert(0, strConcat);
        } else {
            sb.insert(0, strConcat + ": ");
        }
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        if (!TextUtils.isEmpty(oDiamondFeed != null ? oDiamondFeed.subText : null)) {
            ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
            sb.insert(0, oDiamondFeed2 != null ? oDiamondFeed2.subText : null);
        }
        return sb.toString();
    }
}
