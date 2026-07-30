package com.p000p1.mobile.putong.core.p001ui.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.MomentAction;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.p000p1.mobile.putong.core.data.StickerSource;
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreCommendHintEmojiView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StickerInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b86;
import l.dac0;
import l.e30;
import l.fcz;
import l.j760;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p003l.l6c0;
import p003l.szb0;
import p003l.xn7;
import p003l.y19;
import p003l.y4c0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreCommendHintEmojiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1477a;

    /* JADX INFO: renamed from: b */
    public View f1478b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f1479c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f1480d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1481e;

    /* JADX INFO: renamed from: f */
    public VImage f1482f;

    /* JADX INFO: renamed from: g */
    public C3100a f1483g;

    /* JADX INFO: renamed from: h */
    public C3101b f1484h;

    /* JADX INFO: renamed from: i */
    public EditText f1485i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f1486j;

    /* JADX INFO: renamed from: k */
    public boolean f1487k;

    /* JADX INFO: renamed from: l */
    public String f1488l;

    /* JADX INFO: renamed from: m */
    public boolean f1489m;

    /* JADX INFO: renamed from: n */
    public boolean f1490n;

    /* JADX INFO: renamed from: o */
    public List<String> f1491o;

    /* JADX INFO: renamed from: p */
    public StickerInfo f1492p;

    /* JADX INFO: renamed from: q */
    public Media f1493q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$a */
    public class C3100a extends dac0<Sticker> {

        /* JADX INFO: renamed from: c */
        public final List<Sticker> f1494c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f1495d;

        /* JADX INFO: renamed from: e */
        public Act f1496e;

        /* JADX INFO: renamed from: f */
        public String f1497f;

        public C3100a(Act act, e30<Sticker> e30Var) {
            this.f1495d = e30Var;
            this.f1496e = act;
        }

        /* JADX INFO: renamed from: C */
        public int m2630C() {
            if (this.f1494c.size() == 0) {
                return 0;
            }
            return this.f1494c.size() + (!CoreCommendHintEmojiView.this.f1489m ? 1 : 0);
        }

        /* JADX INFO: renamed from: D */
        public View m2631D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f5793E0, (ViewGroup) null);
            }
            VImage vImage = new VImage(viewGroup.getContext());
            vImage.setImageResource(upa.z() ? x2c0.d8 : x2c0.c8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.d(56.0f), t100.d(56.0f));
            layoutParams.rightMargin = t100.d(100.0f);
            vImage.setLayoutParams(layoutParams);
            return vImage;
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m2629A(final View view, final Sticker sticker, int i, final int i2) {
            if (i == 0) {
                xdl0.L(view, new View.OnClickListener() { // from class: l.un7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f7776a.m2635K(view, view2);
                    }
                });
                return;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeViewFindViewById = frameLayout.findViewById(y4c0.f8661C1);
            CoreModule.N().R9(vDraweeViewFindViewById, 10.0f);
            if (!NullChecker.a(sticker) || sticker.pictures.isEmpty()) {
                qib0.G.o(vDraweeViewFindViewById);
                return;
            }
            frameLayout.setTag(sticker);
            if (TEnum.equals(sticker.source, StickerSource.shanmeng)) {
                qib0.G.L0(vDraweeViewFindViewById, ((Media) sticker.pictures.get(0)).url);
                sticker.hash = ogw.e(((Media) sticker.pictures.get(0)).url);
            } else {
                qib0.G.B0(vDraweeViewFindViewById, m2639O(sticker.pictures.get(0)));
            }
            xdl0.L(frameLayout, new View.OnClickListener() { // from class: l.vn7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8005a.m2636L(sticker, i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f1494c.size()) {
                return null;
            }
            return this.f1494c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m2634J(int i, int i2, int i3, Intent intent) {
            if (i2 != i || i3 != -1 || !NullChecker.a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.o);
            if (!NullChecker.a(this.f1495d)) {
                return true;
            }
            this.f1495d.call(sticker);
            return true;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m2635K(View view, View view2) {
            zvf0.r("e_gif_search", CoreCommendHintEmojiView.this.f1488l);
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.j, true);
            final int i = 10003;
            this.f1496e.startActivityForResult(10003, intent, new a.a() { // from class: l.wn7
                /* JADX INFO: renamed from: a */
                public final boolean m10530a(int i2, int i3, Intent intent2) {
                    return this.f8205a.m2634J(i, i2, i3, intent2);
                }
            });
            this.f1496e.overridePendingTransition(szb0.f7494e, szb0.f7490a);
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m2636L(Sticker sticker, int i, View view) {
            zvf0.u("e_gif_recommend", CoreCommendHintEmojiView.this.f1488l, new j760[]{vwb.Y("search_word", this.f1497f), vwb.Y("gif_recommend_scene", MomentAction.comment)});
            if (NullChecker.a(this.f1495d)) {
                this.f1495d.call(sticker);
            }
            if (CoreCommendHintEmojiView.this.f1489m) {
                CoreCommendHintEmojiView.this.m2615p(false, i);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m2637M(List<Sticker> list) {
            this.f1494c.clear();
            this.f1494c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public void m2638N(String str) {
            this.f1497f = str;
        }

        /* JADX INFO: renamed from: O */
        public Picture.ImageUri m2639O(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        public int getItemViewType(int i) {
            return i == this.f1494c.size() ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$b */
    public class C3101b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public Act f1499a;

        /* JADX INFO: renamed from: b */
        public C3100a f1500b;

        /* JADX INFO: renamed from: c */
        public RecyclerView f1501c;

        /* JADX INFO: renamed from: d */
        public RelativeLayout f1502d;

        public C3101b(Act act, C3100a c3100a, RelativeLayout relativeLayout, RecyclerView recyclerView) {
            this.f1499a = act;
            this.f1500b = c3100a;
            this.f1502d = relativeLayout;
            this.f1501c = recyclerView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (xdl0.O0(this.f1502d)) {
                return;
            }
            CoreCommendHintEmojiView.this.m2608B(editable != null ? vwb.M(editable == null ? null : editable.toString()) : null, true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public CoreCommendHintEmojiView(Context context) {
        super(context);
        this.f1488l = "p_user_moment_interactions_details_view";
        this.f1489m = false;
        this.f1490n = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2594a() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2596c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2597d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2599f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m2607A() {
        this.f1492p = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m2608B(final List<String> list, final boolean z) {
        this.f1490n = vwb.J(list);
        if (vwb.J(list) || (TextUtils.isEmpty(this.f1485i.getText().toString()) && z)) {
            this.f1483g.m2637M(new ArrayList());
            xdl0.M(this.f1479c, false);
            m2616q();
            m2611E(Boolean.TRUE);
            return;
        }
        if (this.f1489m && (list.get(0).length() > 4 || (z && TextUtils.isEmpty(list.get(0))))) {
            m2616q();
        } else if (list.get(0).length() > 10) {
            return;
        }
        m2614o().duringCreated(CoreModule.c.Z.n3(list, z)).subscribe(mkd0.H(new e30() { // from class: l.ln7
            public final void call(Object obj) {
                this.f6172a.m2623x(z, list, (List) obj);
            }
        }, new e30() { // from class: l.mn7
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m2597d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m2609C(Sticker sticker) {
        if (m2614o() instanceof MessagesAct) {
            final fcz fczVarL = m2614o().l();
            this.f1485i.setText("");
            m2616q();
            m2614o().duringCreated(CoreModule.c.Z.T.Q(sticker.cloneSticker()).filter(new w9j() { // from class: l.rn7
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((Sticker) obj));
                }
            }).take(1)).subscribe(mkd0.H(new e30() { // from class: l.sn7
                public final void call(Object obj) {
                    fczVarL.R6((Sticker) obj, false);
                }
            }, new e30() { // from class: l.tn7
                public final void call(Object obj) {
                    CoreCommendHintEmojiView.m2599f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m2610D(EditText editText, boolean z, e30<Boolean> e30Var, boolean z2) {
        this.f1485i = editText;
        this.f1486j = e30Var;
        this.f1487k = z;
        this.f1489m = z2 && y19.m11093Q();
        C3101b c3101b = new C3101b(m2614o(), this.f1483g, this.f1480d, this.f1479c);
        this.f1484h = c3101b;
        this.f1485i.addTextChangedListener(c3101b);
        if (!this.f1489m) {
            m2611E(Boolean.valueOf(z));
            return;
        }
        fcz fczVarL = m2614o().l();
        if (NullChecker.a(editText) && NullChecker.a(editText.getText()) && !TextUtils.isEmpty(editText.getText().toString())) {
            m2608B(vwb.M(editText.getText().toString()), true);
            fczVarL.U = true;
        } else if (!fczVarL.U) {
            List<String> listB = b86.b(y19.m11101Y().hint_emoji_array, 5);
            this.f1491o = listB;
            m2608B(listB, false);
            fczVarL.U = true;
        }
        this.f1488l = m2614o().pageId();
        m2611E(Boolean.FALSE);
        xdl0.X(this.f1479c, t100.j);
        this.f1479c.setPadding(t100.d(16.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: E */
    public final void m2611E(Boolean bool) {
        boolean z = this.f1489m;
        View view = this.f1478b;
        if (z) {
            xdl0.M(view, false);
        } else {
            xdl0.M(view, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public Picture.ImageUri m2612F(Picture picture) {
        return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
    }

    public Object getSelectStickerInfoOrMedia() {
        if (NullChecker.a(this.f1492p)) {
            return this.f1492p;
        }
        if (NullChecker.a(this.f1493q)) {
            return this.f1493q;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m2613n(View view) {
        xn7.m10937a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public Act m2614o() {
        return getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f1484h) && NullChecker.a(this.f1485i)) {
            this.f1485i.removeTextChangedListener(this.f1484h);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m2613n(this);
        m2619t(m2614o());
        xdl0.E0(this.f1482f, new View.OnClickListener() { // from class: l.kn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5676a.m2622w(view);
            }
        });
        CoreModule.N().In(this.f1480d, this.f1482f);
        CoreModule.N().R9(this.f1481e, 10.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m2615p(boolean z, int i) {
        String strR3 = m2614o().l().r3();
        StringBuilder sb = new StringBuilder();
        if (NullChecker.a(this.f1485i.getText()) && !TextUtils.isEmpty(this.f1485i.getText().toString())) {
            sb.append(this.f1485i.getText().toString());
        } else if (!vwb.J(this.f1491o)) {
            if (z || i < 0 || this.f1491o.size() <= i) {
                for (int i2 = 0; i2 < this.f1491o.size(); i2++) {
                    String str = this.f1491o.get(i2);
                    if (i2 == 0) {
                        sb.append(str);
                    } else {
                        sb.append(",");
                        sb.append(str);
                    }
                }
            } else {
                sb.append(this.f1491o.get(i));
            }
        }
        if (z) {
            zvf0.A("e_sticker", "p_chat_view", new j760[]{vwb.Y("other_uid", strR3), vwb.Y("topic_content", sb.toString())});
        } else {
            zvf0.u("e_sticker", "p_chat_view", new j760[]{vwb.Y("other_uid", strR3), vwb.Y("topic_content", sb.toString())});
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2616q() {
        if (this.f1489m && (m2614o() instanceof MessagesAct)) {
            m2614o().w2().Q1(true, new Runnable() { // from class: l.on7
                @Override // java.lang.Runnable
                public final void run() {
                    CoreCommendHintEmojiView.m2594a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2617r() {
        setBackgroundColor(0);
        m2611E(Boolean.FALSE);
        xdl0.M(this.f1479c, false);
        xdl0.M(this.f1480d, true);
    }

    /* JADX INFO: renamed from: s */
    public void m2618s() {
        setBackgroundColor(-1);
        m2625z();
        m2607A();
        m2611E(Boolean.TRUE);
        xdl0.M(this.f1480d, false);
        if (NullChecker.a(this.f1486j)) {
            this.f1486j.call(Boolean.FALSE);
        }
    }

    public void setHintStickers(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        List<String> list2 = this.f1491o;
        if (list2 == null) {
            this.f1491o = new ArrayList();
        } else {
            list2.clear();
        }
        this.f1491o.addAll(list);
        m2608B(this.f1491o, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m2619t(Context context) {
        this.f1483g = new C3100a(m2614o(), new e30() { // from class: l.nn7
            public final void call(Object obj) {
                this.f6534a.m2620u((Sticker) obj);
            }
        });
        this.f1479c.setPadding(t100.d(9.0f), 1, 0, 0);
        this.f1479c.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f1479c.setAdapter(this.f1483g);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2620u(Sticker sticker) {
        if (this.f1489m) {
            m2609C(sticker);
        } else {
            m2624y(sticker, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2621v(String str, List list) {
        if (vwb.J(list) || TextUtils.isEmpty(this.f1485i.getText().toString())) {
            return;
        }
        zvf0.A("e_gif_recommend", this.f1488l, new j760[]{vwb.Y("search_word", str), vwb.Y("gif_recommend_scene", MomentAction.comment)});
        this.f1483g.m2638N(str);
        setBackgroundColor(-1);
        xdl0.M(this.f1479c, true);
        m2611E(Boolean.TRUE);
        this.f1477a.setBackgroundColor(0);
        if (list.size() > 10) {
            list = list.subList(0, 10);
        }
        this.f1483g.m2637M(list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m2622w(View view) {
        m2618s();
        this.f1486j.call(Boolean.FALSE);
        final String string = this.f1485i.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m2614o().duringCreated(CoreModule.c.Z.p3(string)).subscribe(mkd0.H(new e30() { // from class: l.pn7
            public final void call(Object obj) {
                this.f6886a.m2621v(string, (List) obj);
            }
        }, new e30() { // from class: l.qn7
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m2596c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m2623x(boolean z, List list, List list2) {
        if (this.f1490n || (TextUtils.isEmpty(this.f1485i.getText().toString()) && z)) {
            m2611E(Boolean.TRUE);
            return;
        }
        if (vwb.J(list2)) {
            if (this.f1489m) {
                m2616q();
                return;
            }
            return;
        }
        String str = list.size() == 1 ? (String) list.get(0) : "";
        zvf0.A("e_gif_recommend", this.f1488l, new j760[]{vwb.Y("search_word", str), vwb.Y("gif_recommend_scene", MomentAction.comment)});
        setVisibility(0);
        this.f1483g.m2638N(str);
        setBackgroundColor(-1);
        xdl0.M(this.f1479c, true);
        m2611E(Boolean.TRUE);
        this.f1477a.setBackgroundColor(0);
        if (list2.size() > 10) {
            list2 = list2.subList(0, 10);
        }
        this.f1483g.m2637M(list2);
        if (this.f1489m) {
            m2615p(true, -1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m2624y(Object obj, Media media) {
        if (media == null && obj == null) {
            return;
        }
        if (NullChecker.a(media)) {
            setVisibility(0);
            m2607A();
            this.f1486j.call(Boolean.TRUE);
            this.f1477a.setBackgroundColor(0);
            setBackgroundColor(0);
            this.f1493q = media;
            m2617r();
            qib0.G.I0(this.f1481e, media.url, t100.d(64.0f), t100.d(64.0f));
            return;
        }
        Sticker sticker = obj instanceof Sticker ? (Sticker) obj : null;
        if (sticker == null) {
            return;
        }
        setVisibility(0);
        this.f1486j.call(Boolean.TRUE);
        this.f1477a.setBackgroundColor(0);
        setBackgroundColor(0);
        m2617r();
        m2625z();
        this.f1492p = sticker.cloneSticker();
        if (TEnum.equals(sticker.source, StickerSource.shanmeng)) {
            qib0.G.I0(this.f1481e, ((Media) sticker.pictures.get(0)).url, t100.d(64.0f), t100.d(64.0f));
        } else {
            qib0.G.B0(this.f1481e, m2612F(sticker.pictures.get(0)));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2625z() {
        this.f1493q = null;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1488l = "p_user_moment_interactions_details_view";
        this.f1489m = false;
        this.f1490n = false;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1488l = "p_user_moment_interactions_details_view";
        this.f1489m = false;
        this.f1490n = false;
    }
}
