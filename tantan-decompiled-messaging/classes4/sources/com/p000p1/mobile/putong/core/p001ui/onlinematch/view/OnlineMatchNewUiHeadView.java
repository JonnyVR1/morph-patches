package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.baidu.mapapi.model.LatLng;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchNewUiHeadView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.d90;
import l.e30;
import l.e51;
import l.i0g0;
import l.kn50;
import l.mjj;
import l.qc2;
import l.qib0;
import l.rw6;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import l.zxz;
import org.json.JSONException;
import org.json.JSONObject;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchNewUiHeadView extends OnlineMatchBaseHeadView {

    /* JADX INFO: renamed from: A */
    public VText f579A;

    /* JADX INFO: renamed from: B */
    public int f580B;

    /* JADX INFO: renamed from: C */
    public String f581C;

    /* JADX INFO: renamed from: D */
    public CharSequence f582D;

    /* JADX INFO: renamed from: E */
    public CharSequence f583E;

    /* JADX INFO: renamed from: F */
    public CharSequence f584F;

    /* JADX INFO: renamed from: a */
    public LinearLayout f585a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f586b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f587c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f588d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f589e;

    /* JADX INFO: renamed from: f */
    public VImage f590f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f591g;

    /* JADX INFO: renamed from: h */
    public VLinear f592h;

    /* JADX INFO: renamed from: i */
    public VText f593i;

    /* JADX INFO: renamed from: j */
    public VText f594j;

    /* JADX INFO: renamed from: k */
    public VText f595k;

    /* JADX INFO: renamed from: l */
    public TextView f596l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f597m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f598n;

    /* JADX INFO: renamed from: o */
    public VImage f599o;

    /* JADX INFO: renamed from: p */
    public VText f600p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f601q;

    /* JADX INFO: renamed from: r */
    public VImage f602r;

    /* JADX INFO: renamed from: s */
    public VText f603s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f604t;

    /* JADX INFO: renamed from: u */
    public VImage f605u;

    /* JADX INFO: renamed from: v */
    public VText f606v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f607w;

    /* JADX INFO: renamed from: x */
    public VImage f608x;

    /* JADX INFO: renamed from: y */
    public VText f609y;

    /* JADX INFO: renamed from: z */
    public VRelative f610z;

    public OnlineMatchNewUiHeadView(@NonNull Context context) {
        super(context);
        this.f580B = 0;
        this.f581C = "";
        this.f582D = "";
        this.f583E = "";
        this.f584F = "";
    }

    private String getCheckTxt() {
        String strF = RemoteConfig.x().F("icebreaking_check_txt");
        if (TextUtils.isEmpty(strF)) {
            return "查看更多";
        }
        try {
            String strOptString = new JSONObject(strF).optString("content");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "查看更多";
        } catch (JSONException unused) {
            return "查看更多";
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m798r(List list, final Tag tag, final Tag tag2) {
        return vwb.G(list, new w9j() { // from class: l.wm50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.G(list, new w9j() { // from class: l.xm50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m801u(e30 e30Var, d90 d90Var) {
        if (d90Var == null) {
            e30Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(d90Var.c())) {
            e30Var.call(d90Var.c());
        } else if (TextUtils.isEmpty(d90Var.f())) {
            e30Var.call("");
        } else {
            e30Var.call(d90Var.f());
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m802v(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m805A(StringBuilder sb, List<Tag> list) {
        if (vwb.J(list)) {
            return;
        }
        int iMin = Math.min(list.size(), 3);
        for (int i = 0; i < iMin && this.f580B < 8; i++) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("、");
            }
            this.f580B++;
            sb.append(list.get(i).value);
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m806B(User user) {
        return TEnum.equals(user.gender, "female") ? "她" : "他";
    }

    /* JADX INFO: renamed from: C */
    public final String m807C(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = user.location.region.country;
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if ((!TextUtils.isEmpty(user.location.region.city) || !TextUtils.isEmpty(user.location.region.district)) && NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "default")) {
            str2 = user.location.region.city + user.location.region.district;
        }
        if (!TextUtils.isEmpty(str2) && !user.isHideLocationFromSVip() && NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "default")) {
            if (user.location.distance < 1000) {
                str = i0g0.b.format(user.location.distance) + CoreModule.b.getString(R.string.U4);
            } else {
                str = i0g0.b.format(user.location.distance / 1000.0f) + CoreModule.b.getString(R.string.i4);
            }
            sb.append("居住在");
            sb.append(str2);
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        String str3 = user.profile.hometown;
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(", ");
            }
            sb.append("来自");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public final CharSequence m808D(User user, User user2, String str) {
        CharSequence charSequenceM810F = m810F(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM810F};
        if (!TextUtils.isEmpty(charSequenceM810F)) {
            if (NullChecker.a(this.f602r)) {
                this.f602r.setImageResource(ura.e().d().I4() ? c3c0.G2 : c3c0.D2);
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m823S("你们曾经在 " + str + " 擦肩而过", str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m823S("你们曾擦肩而过过 " + user2.location.passby.count + " 次", String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m819O(user, user2);
    }

    /* JADX INFO: renamed from: E */
    public final void m809E(Act act, User user, final e30<String> e30Var) {
        if (e30Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            e30Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngB = qc2.b(new LatLng(doublePair.first, doublePair.second));
        mjj mjjVarC = mjj.c(act, false);
        if (latLngB == null) {
            e30Var.call("");
        } else {
            mjjVarC.e(act, latLngB.latitude, latLngB.longitude, new e30() { // from class: l.um50
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m801u(e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.vm50
                public final void call(Object obj) {
                    OnlineMatchNewUiHeadView.m802v((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final CharSequence m810F(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListN = vwb.n(user2.profile.tags, new w9j() { // from class: l.en50
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.ym50
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN)) {
            return "";
        }
        final ArrayList arrayListN2 = vwb.n(user.profile.tags, new w9j() { // from class: l.fn50
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.an50
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.gn50
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnlineMatchNewUiHeadView.m798r(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListN2, comparator);
        Collections.sort(arrayListN, comparator);
        ArrayList arrayListN3 = vwb.n(arrayListN, new w9j() { // from class: l.hn50
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(vwb.r(arrayListN2, new w9j() { // from class: l.zm50
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (vwb.J(arrayListN3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("你们都喜欢：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListN3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListN3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m823S(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: G */
    public final CharSequence m811G(User user) {
        this.f580B = 0;
        StringBuilder sb = new StringBuilder();
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f580B++;
            sb.append("学生");
        } else {
            if (!TextUtils.isEmpty(profile.work.industry) && !TextUtils.equals(user.profile.work.industry, "其他") && !TextUtils.equals(user.profile.work.industry, "其它") && !TextUtils.equals(user.profile.work.industry, "学生")) {
                this.f580B++;
                sb.append(user.profile.work.industry);
            }
            if (!TextUtils.isEmpty(user.profile.work.department) && !TextUtils.equals(user.profile.work.department, "其他") && !TextUtils.equals(user.profile.work.department, "其它") && !TextUtils.equals(user.profile.work.department, "学生")) {
                if (TextUtils.isEmpty(sb)) {
                    this.f580B++;
                } else {
                    sb.append("·");
                }
                sb.append(user.profile.work.department);
            }
        }
        m805A(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.in50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m805A(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.jn50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m805A(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.rm50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m805A(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.sm50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m805A(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.tm50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m823S(m806B(user) + "的标签：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m812H(User user, Question question) {
        Question questionO3;
        if (vwb.J(user.profile.answers)) {
            questionO3 = null;
        } else {
            questionO3 = CoreModule.c.d0.o3(((Answer) user.profile.answers.get(0)).question);
        }
        if (questionO3 != null) {
            question = questionO3;
        }
        if (question == null) {
            return "";
        }
        return "和" + m806B(user) + "聊聊: " + question.text;
    }

    /* JADX INFO: renamed from: I */
    public final String m813I(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? i0g0.j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: J */
    public boolean m814J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m815K(User user, View view) {
        xdl0.E(this).l().w6("messages_thumbnail_left", ((DbObject) user).id);
        zvf0.r("e_match_person_quickchat", "p_chat_view");
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m816L(List list, Act act, User user, User user2) {
        m822R(act, user, user2, vwb.J(list) ? null : (Question) list.get(0));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m817M(final Act act, final User user, final User user2) {
        final List listQuery = CoreModule.k.e.query((Filter) null, (Order) null, 1);
        e51.G(new Runnable() { // from class: l.cn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f8759a.m816L(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m818N(User user, User user2, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f581C = m807C(user);
        if (NullChecker.a(this.f598n)) {
            this.f600p.setText(this.f581C);
            xdl0.M(this.f598n, !TextUtils.isEmpty(this.f581C));
        } else if (!TextUtils.isEmpty(this.f581C)) {
            sb.append(this.f581C);
        }
        this.f582D = m808D(user2, user, str);
        if (NullChecker.a(this.f601q)) {
            this.f603s.setText(this.f582D);
            xdl0.M(this.f601q, !TextUtils.isEmpty(this.f582D));
        } else if (!TextUtils.isEmpty(this.f582D)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f582D);
        }
        this.f583E = m811G(user);
        if (NullChecker.a(this.f604t)) {
            this.f606v.setText(this.f583E);
            xdl0.M(this.f604t, !TextUtils.isEmpty(this.f583E));
        } else if (!TextUtils.isEmpty(this.f583E)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f583E);
        }
        this.f584F = m812H(user, question);
        if (NullChecker.a(this.f607w)) {
            this.f609y.setText(this.f584F);
            xdl0.M(this.f607w, !TextUtils.isEmpty(this.f584F));
        } else {
            if (TextUtils.isEmpty(this.f584F)) {
                return;
            }
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f584F);
        }
    }

    /* JADX INFO: renamed from: O */
    public final CharSequence m819O(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.a(this.f602r)) {
            this.f602r.setImageResource(ura.e().d().I4() ? c3c0.C2 : c3c0.z2);
        }
        return m823S("你们都在 " + user.profile.studies.school + " 上过学", user.profile.studies.school);
    }

    /* JADX INFO: renamed from: P */
    public final void m820P(User user, User user2) {
        boolean z = CoreModule.c.E0.z3(user2) || m814J(user2);
        if (NullChecker.a(this.f593i)) {
            boolean zM814J = m814J(user2);
            VText vText = this.f593i;
            if (zM814J) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f593i.getPaint().setFakeBoldText(true);
        }
        if (NullChecker.a(this.f595k) && !z) {
            this.f595k.setText(" · " + user2.age + "岁");
            this.f595k.setVisibility(0);
        }
        if (NullChecker.a(this.f587c)) {
            qib0.G.Q0(this.f587c, rw6.b(user).profileSmall());
        }
        if (m814J(user2) || !NullChecker.a(this.f594j)) {
            return;
        }
        this.f594j.setText(m813I(user2));
    }

    /* JADX INFO: renamed from: Q */
    public final void m821Q(final Act act, final User user, final User user2) {
        if (m814J(user2)) {
            return;
        }
        e51.y(new Runnable() { // from class: l.bn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f8272a.m817M(act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m822R(Act act, final User user, final User user2, final Question question) {
        m809E(act, user2, new e30() { // from class: l.dn50
            public final void call(Object obj) {
                this.f9358a.m818N(user2, user, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m823S(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(ura.e().d().I4() ? -16777216 : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: a */
    public void mo738a(User user, int i) {
        if (user == null) {
            return;
        }
        if (user.inactivated) {
            qib0.G.Y0(getImageSmall(), CoreModule.P().i().f3());
            return;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if (i == 100 || (NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na()))) {
            qib0.G.L0(getImageSmall(), rw6.a(user).profileSmall().formatted());
        } else {
            CoreModule.P().i().y2(getImageSmall(), rw6.a(user).profileSmall(), i);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: b */
    public void mo739b(User user, final User user2, Conversation conversation) {
        xdl0.E0(this.f585a, new View.OnClickListener() { // from class: l.qm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18091a.m815K(user2, view);
            }
        });
        if (CoreModule.P().i().D()) {
            zxz.h().p(((DbObject) user2).id, "headView", getTickleAnimContent(), getImageSmall());
        }
        String str = (NullChecker.a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.c.e0.na())) ? "每人发送20句消息，即可成为正式好友" : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f579A.setText(str);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: c */
    public void mo740c(User user, User user2) {
        m820P(user, user2);
        m821Q(m825z(), user, user2);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseHeadView
    /* JADX INFO: renamed from: d */
    public void mo741d(boolean z) {
        xdl0.M(this.f610z, z);
    }

    public VDraweeView getImageSmall() {
        return this.f589e;
    }

    public FrameLayout getTickleAnimContent() {
        return this.f591g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m824y(this);
        if (ura.e().d().I4()) {
            this.f593i.setTextColor(getResources().getColor(a1c0.g));
            this.f594j.setTextColor(getResources().getColor(a1c0.i));
            this.f595k.setTextColor(getResources().getColor(a1c0.i));
            this.f596l.setTextColor(getResources().getColor(a1c0.i));
            xdl0.N(this.f599o, c3c0.v2);
            this.f600p.setTextColor(getResources().getColor(a1c0.h));
            xdl0.N(this.f602r, c3c0.y2);
            this.f603s.setTextColor(getResources().getColor(a1c0.h));
            xdl0.N(this.f605u, c3c0.G2);
            this.f606v.setTextColor(getResources().getColor(a1c0.h));
            xdl0.N(this.f608x, c3c0.J2);
            this.f609y.setTextColor(getResources().getColor(a1c0.h));
            this.f579A.setTextColor(getResources().getColor(a1c0.i));
        }
        zvf0.x("e_match_person_information", "p_chat_view");
        this.f596l.setText(getCheckTxt());
    }

    /* JADX INFO: renamed from: y */
    public final void m824y(View view) {
        kn50.a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MessagesAct m825z() {
        return getContext();
    }

    public OnlineMatchNewUiHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f580B = 0;
        this.f581C = "";
        this.f582D = "";
        this.f583E = "";
        this.f584F = "";
    }
}
