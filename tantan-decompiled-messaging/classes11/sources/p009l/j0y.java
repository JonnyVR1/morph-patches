package p009l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.MeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ODiamondFeed;
import com.p1.mobile.putong.core.data.ODiamondFeedLatestVisitor;
import com.p1.mobile.putong.core.data.ODiamondFeedType;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import l.eqh0;
import l.j760;
import l.pib;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0014\u00107\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u00109\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00101¨\u0006:"}, d2 = {"Ll/j0y;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", "d", "()Ljava/lang/String;", "j", "i", "Lcom/p1/mobile/putong/data/User;", "user", "l", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/CharSequence;", "", "currentTime", "", "deadLineTime", "k", "(JD)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "visitorUser", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "oDiamondFeed", "I", "ONE_MINUTE", "ONE_HOUR", "e", "ONE_DAY", "ONE_WEAK", "ONE_MONTH", "h", "ONE_YEAR", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0y implements jwl {

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

    public j0y() {
        int i = 60 * 60;
        this.ONE_HOUR = i;
        this.ONE_DAY = i * 24;
        this.ONE_WEAK = i * 168;
        this.ONE_MONTH = i * 720;
        this.ONE_YEAR = i * 8760;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m16819h(j0y j0yVar, BusinessConversationView businessConversationView, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", j0yVar.mo12329d())});
        businessConversationView.getContext().startActivity(MeetAct.m4580Y1(businessConversationView.getContext(), "", "visitor"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.jwl
    /* JADX INFO: renamed from: a */
    public void mo12327a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor2;
        viewModel.getClass();
        _view.getClass();
        int i = 0;
        xdl0.M(_view.f4513i, false);
        xdl0.h0(_view.f4512h, t100.d(7.0f));
        _view.f4512h.setBackgroundResource(x2c0.he);
        if (m16821j()) {
            boolean z = upa.z();
            VImage vImage = _view.f4525u;
            if (z) {
                vImage.setImageResource(x2c0.fg);
            } else {
                vImage.setImageResource(x2c0.me);
            }
            xdl0.M(_view.f4525u, true);
            ODiamondFeed oDiamondFeed = this.oDiamondFeed;
            if (oDiamondFeed == null || !oDiamondFeed.redDot) {
                xdl0.M(_view.f4530z, false);
            } else {
                ViewGroup.LayoutParams layoutParams = _view.f4530z.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = -2;
                    marginLayoutParams.height = t100.q;
                    marginLayoutParams.topMargin = -t100.f;
                    _view.f4530z.setLayoutParams(marginLayoutParams);
                }
                _view.f4530z.setMinWidth(t100.q);
                _view.f4530z.setBackgroundResource(x2c0.U5);
                VText vText = _view.f4530z;
                ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
                if (oDiamondFeed2 != null && (oDiamondFeedLatestVisitor2 = oDiamondFeed2.latestVisitor) != null) {
                    i = oDiamondFeedLatestVisitor2.visitCount;
                }
                vText.setText(zz6.q0(i));
                xdl0.M(_view.f4530z, true);
            }
            xdl0.M(_view.f4507A, true);
            VText vText2 = _view.f4507A;
            long jM18550o = mqi0.m18550o();
            ODiamondFeed oDiamondFeed3 = this.oDiamondFeed;
            vText2.setText(m16822k(jM18550o, (oDiamondFeed3 == null || (oDiamondFeedLatestVisitor = oDiamondFeed3.latestVisitor) == null) ? 0.0d : oDiamondFeedLatestVisitor.latestVisitTime));
        } else {
            boolean z2 = upa.z();
            VImage vImage2 = _view.f4525u;
            if (z2) {
                vImage2.setImageResource(x2c0.cg);
            } else {
                vImage2.setImageResource(x2c0.je);
            }
            xdl0.M(_view.f4525u, true);
            ODiamondFeed oDiamondFeed4 = this.oDiamondFeed;
            if (oDiamondFeed4 == null || !oDiamondFeed4.redDot) {
                xdl0.M(_view.f4530z, false);
            } else {
                ViewGroup.LayoutParams layoutParams2 = _view.f4530z.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    int i2 = t100.j;
                    marginLayoutParams.width = i2;
                    marginLayoutParams.height = i2;
                    marginLayoutParams.topMargin = t100.c;
                    _view.f4530z.setLayoutParams(marginLayoutParams);
                }
                _view.f4530z.setMinWidth(t100.j);
                _view.f4530z.setText("");
                _view.f4530z.setBackgroundResource(x2c0.X5);
                xdl0.M(_view.f4530z, true);
            }
            xdl0.M(_view.f4507A, true);
            _view.f4507A.setText("刚刚");
        }
        xdl0.E0(_view, new View.OnClickListener() { // from class: l.i0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0y.m16819h(this.f14370a, _view, view);
            }
        });
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo11182b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        ODiamondFeed oDiamondFeed = meetEntranceData.getODiamondFeed();
        if (oDiamondFeed != null) {
            List list = oDiamondFeed.userIds;
            list.getClass();
            if (!list.isEmpty()) {
                User userPa = CoreModule.c.e0.Pa((String) oDiamondFeed.userIds.get(0));
                if (userPa != null) {
                    this.visitorUser = userPa;
                    this.oDiamondFeed = oDiamondFeed;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo12328c() {
        return (xma.F3() || this.visitorUser == null) ? false : true;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo12329d() {
        return m16821j() ? "new_visitor" : "odiamond_sayhi";
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo14718e() {
        return super.mo14718e();
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: f */
    public int mo12330f() {
        return 0;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo12331g() {
        List list;
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
            SpannableStringBuilder spannableStringBuilderM16130c0 = i0g0.m16130c0(oDiamondFeed3 != null ? oDiamondFeed3.subText : null, vwb.f0(new String[]{oDiamondFeed3 != null ? oDiamondFeed3.highLight : null}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), eqh0.c(2));
            spannableStringBuilderM16130c0.getClass();
            return spannableStringBuilderM16130c0;
        }
        if (m16820i()) {
            ODiamondFeed oDiamondFeed4 = this.oDiamondFeed;
            if (!vwb.J(oDiamondFeed4 != null ? oDiamondFeed4.userIds : null)) {
                pib pibVar = CoreModule.c.e0;
                ODiamondFeed oDiamondFeed5 = this.oDiamondFeed;
                if (oDiamondFeed5 != null && (list = oDiamondFeed5.userIds) != null) {
                    str2 = (String) list.get(0);
                }
                User userPa = pibVar.Pa(str2);
                if (NullChecker.a(userPa)) {
                    userPa.getClass();
                    return m16823l(userPa);
                }
            }
        }
        return "";
    }

    @Override // p009l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureFp;
        User user = this.visitorUser;
        if (user == null || (pictureFp = user.fp()) == null) {
            return null;
        }
        return pictureFp.profileSmall();
    }

    @Override // p009l.jwl
    @NotNull
    public CharSequence getTitle() {
        String str;
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        if (TextUtils.isEmpty(oDiamondFeed != null ? oDiamondFeed.text : null)) {
            return m16820i() ? "一键配对" : "谁看过我";
        }
        ODiamondFeed oDiamondFeed2 = this.oDiamondFeed;
        return (oDiamondFeed2 == null || (str = oDiamondFeed2.text) == null) ? "谁看过我" : str;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m16820i() {
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        return TEnum.equals(oDiamondFeed != null ? oDiamondFeed.feedType : null, ODiamondFeedType.get("instantChat"));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16821j() {
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        return TEnum.equals(oDiamondFeed != null ? oDiamondFeed.feedType : null, ODiamondFeedType.get("latestVisitor"));
    }

    /* JADX INFO: renamed from: k */
    public final String m16822k(long currentTime, double deadLineTime) {
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
    public final CharSequence m16823l(User user) {
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
                Region region = CoreModule.c.e0.p9().location.region;
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
                String strR0 = zz6.r0(i);
                if (i <= 10000 || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(sb.toString())) {
                        sb.append(strR0);
                    } else {
                        sb.append("、");
                        sb.append(strR0);
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
