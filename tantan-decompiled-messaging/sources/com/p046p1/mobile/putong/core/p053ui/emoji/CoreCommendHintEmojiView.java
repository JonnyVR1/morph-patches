package com.p046p1.mobile.putong.core.p053ui.emoji;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreCommendHintEmojiView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.b86;
import p149l.dac0;
import p149l.e30;
import p149l.fcz;
import p149l.l6c0;
import p149l.mkd0;
import p149l.ogw;
import p149l.qib0;
import p149l.rn7;
import p149l.szb0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xn7;
import p149l.y19;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreCommendHintEmojiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29083a;

    /* JADX INFO: renamed from: b */
    public View f29084b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f29085c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f29086d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29087e;

    /* JADX INFO: renamed from: f */
    public VImage f29088f;

    /* JADX INFO: renamed from: g */
    public C8325a f29089g;

    /* JADX INFO: renamed from: h */
    public C8326b f29090h;

    /* JADX INFO: renamed from: i */
    public EditText f29091i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f29092j;

    /* JADX INFO: renamed from: k */
    public boolean f29093k;

    /* JADX INFO: renamed from: l */
    public String f29094l;

    /* JADX INFO: renamed from: m */
    public boolean f29095m;

    /* JADX INFO: renamed from: n */
    public boolean f29096n;

    /* JADX INFO: renamed from: o */
    public List<String> f29097o;

    /* JADX INFO: renamed from: p */
    public StickerInfo f29098p;

    /* JADX INFO: renamed from: q */
    public Media f29099q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$a */
    public class C8325a extends dac0<Sticker> {

        /* JADX INFO: renamed from: c */
        public final List<Sticker> f29100c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final e30<Sticker> f29101d;

        /* JADX INFO: renamed from: e */
        public Act f29102e;

        /* JADX INFO: renamed from: f */
        public String f29103f;

        public C8325a(Act act, e30<Sticker> e30Var) {
            this.f29101d = e30Var;
            this.f29102e = act;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (this.f29100c.size() == 0) {
                return 0;
            }
            return this.f29100c.size() + (!CoreCommendHintEmojiView.this.f29095m ? 1 : 0);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f126284E0, (ViewGroup) null);
            }
            VImage vImage = new VImage(viewGroup.getContext());
            vImage.setImageResource(upa.m194847z() ? x2c0.f190070d8 : x2c0.f190038c8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.m186890d(56.0f), t100.m186890d(56.0f));
            layoutParams.rightMargin = t100.m186890d(100.0f);
            vImage.setLayoutParams(layoutParams);
            return vImage;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, final Sticker sticker, int i, final int i2) {
            if (i == 0) {
                xdl0.m208342L(view, new View.OnClickListener() { // from class: l.un7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f177338a.m45313K(view, view2);
                    }
                });
                return;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.f195944C1);
            CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
            if (!NullChecker.m81303a(sticker) || sticker.pictures.isEmpty()) {
                qib0.f154691G.m184725o(vDraweeView);
                return;
            }
            frameLayout.setTag(sticker);
            if (TEnum.equals(sticker.source, "shanmeng")) {
                qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).url);
                sticker.hash = ogw.m164284e(sticker.pictures.get(0).url);
            } else {
                qib0.f154691G.m102312B0(vDraweeView, m45317O(sticker.pictures.get(0)));
            }
            xdl0.m208342L(frameLayout, new View.OnClickListener() { // from class: l.vn7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f182210a.m45314L(sticker, i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f29100c.size()) {
                return null;
            }
            return this.f29100c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m45312J(int i, int i2, int i3, Intent intent) {
            if (i2 != i || i3 != -1 || !NullChecker.m81303a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f31862o);
            if (!NullChecker.m81303a(this.f29101d)) {
                return true;
            }
            this.f29101d.call(sticker);
            return true;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m45313K(View view, View view2) {
            zvf0.m220396r("e_gif_search", CoreCommendHintEmojiView.this.f29094l);
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f31857j, true);
            final int i = 10003;
            this.f29102e.startActivityForResult(10003, intent, new C4317a.a() { // from class: l.wn7
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i2, int i3, Intent intent2) {
                    return this.f187260a.m45312J(i, i2, i3, intent2);
                }
            });
            this.f29102e.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m45314L(Sticker sticker, int i, View view) {
            zvf0.m220399u("e_gif_recommend", CoreCommendHintEmojiView.this.f29094l, vwb.m200311Y("search_word", this.f29103f), vwb.m200311Y("gif_recommend_scene", "comment"));
            if (NullChecker.m81303a(this.f29101d)) {
                this.f29101d.call(sticker);
            }
            if (CoreCommendHintEmojiView.this.f29095m) {
                CoreCommendHintEmojiView.this.m45296p(false, i);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m45315M(List<Sticker> list) {
            this.f29100c.clear();
            this.f29100c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public void m45316N(String str) {
            this.f29103f = str;
        }

        /* JADX INFO: renamed from: O */
        public Picture.ImageUri m45317O(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == this.f29100c.size() ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$b */
    public class C8326b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public Act f29105a;

        /* JADX INFO: renamed from: b */
        public C8325a f29106b;

        /* JADX INFO: renamed from: c */
        public RecyclerView f29107c;

        /* JADX INFO: renamed from: d */
        public RelativeLayout f29108d;

        public C8326b(Act act, C8325a c8325a, RelativeLayout relativeLayout, RecyclerView recyclerView) {
            this.f29105a = act;
            this.f29106b = c8325a;
            this.f29108d = relativeLayout;
            this.f29107c = recyclerView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (xdl0.m208349O0(this.f29108d)) {
                return;
            }
            CoreCommendHintEmojiView.this.m45289B(editable != null ? vwb.m200299M(editable == null ? null : editable.toString()) : null, true);
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
        this.f29094l = "p_user_moment_interactions_details_view";
        this.f29095m = false;
        this.f29096n = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45275a() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m45277c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m45278d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m45280f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m45288A() {
        this.f29098p = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m45289B(final List<String> list, final boolean z) {
        this.f29096n = vwb.m200296J(list);
        if (vwb.m200296J(list) || (TextUtils.isEmpty(this.f29091i.getText().toString()) && z)) {
            this.f29089g.m45315M(new ArrayList());
            xdl0.m208344M(this.f29085c, false);
            m45297q();
            m45292E(Boolean.TRUE);
            return;
        }
        if (this.f29095m && (list.get(0).length() > 4 || (z && TextUtils.isEmpty(list.get(0))))) {
            m45297q();
        } else if (list.get(0).length() > 10) {
            return;
        }
        m45295o().duringCreated(CoreModule.f17545c.f19624Z.m34922n3(list, z)).subscribe(mkd0.m154956H(new e30() { // from class: l.ln7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128968a.m45304x(z, list, (List) obj);
            }
        }, new e30() { // from class: l.mn7
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m45278d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m45290C(Sticker sticker) {
        if (m45295o() instanceof MessagesAct) {
            final fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) m45295o()).mo48974l();
            this.f29091i.setText("");
            m45297q();
            m45295o().duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34952Q(sticker.cloneSticker()).filter(new rn7()).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.sn7
                @Override // p149l.e30
                public final void call(Object obj) {
                    fczVarMo48974l.m120703R6((Sticker) obj, false);
                }
            }, new e30() { // from class: l.tn7
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreCommendHintEmojiView.m45280f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m45291D(EditText editText, boolean z, e30<Boolean> e30Var, boolean z2) {
        this.f29091i = editText;
        this.f29092j = e30Var;
        this.f29093k = z;
        this.f29095m = z2 && y19.m212157Q();
        C8326b c8326b = new C8326b(m45295o(), this.f29089g, this.f29086d, this.f29085c);
        this.f29090h = c8326b;
        this.f29091i.addTextChangedListener(c8326b);
        if (!this.f29095m) {
            m45292E(Boolean.valueOf(z));
            return;
        }
        fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) m45295o()).mo48974l();
        if (NullChecker.m81303a(editText) && NullChecker.m81303a(editText.getText()) && !TextUtils.isEmpty(editText.getText().toString())) {
            m45289B(vwb.m200299M(editText.getText().toString()), true);
            fczVarMo48974l.f96904U = true;
        } else if (!fczVarMo48974l.f96904U) {
            List<String> listM100757b = b86.m100757b(y19.m212165Y().hint_emoji_array, 5);
            this.f29097o = listM100757b;
            m45289B(listM100757b, false);
            fczVarMo48974l.f96904U = true;
        }
        this.f29094l = m45295o().pageId();
        m45292E(Boolean.FALSE);
        xdl0.m208360X(this.f29085c, t100.f167261j);
        this.f29085c.setPadding(t100.m186890d(16.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: E */
    public final void m45292E(Boolean bool) {
        boolean z = this.f29095m;
        View view = this.f29084b;
        if (z) {
            xdl0.m208344M(view, false);
        } else {
            xdl0.m208344M(view, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public Picture.ImageUri m45293F(Picture picture) {
        return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
    }

    public Object getSelectStickerInfoOrMedia() {
        if (NullChecker.m81303a(this.f29098p)) {
            return this.f29098p;
        }
        if (NullChecker.m81303a(this.f29099q)) {
            return this.f29099q;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m45294n(View view) {
        xn7.m210153a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public Act m45295o() {
        return (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f29090h) && NullChecker.m81303a(this.f29091i)) {
            this.f29091i.removeTextChangedListener(this.f29090h);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m45294n(this);
        m45300t(m45295o());
        xdl0.m208329E0(this.f29088f, new View.OnClickListener() { // from class: l.kn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123862a.m45303w(view);
            }
        });
        CoreModule.m29934N().mo60283In(this.f29086d, this.f29088f);
        CoreModule.m29934N().mo60310R9(this.f29087e, 10.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m45296p(boolean z, int i) {
        String strMo120828r3 = ((MessagesAct) m45295o()).mo48974l().mo120828r3();
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m81303a(this.f29091i.getText()) && !TextUtils.isEmpty(this.f29091i.getText().toString())) {
            sb.append(this.f29091i.getText().toString());
        } else if (!vwb.m200296J(this.f29097o)) {
            if (z || i < 0 || this.f29097o.size() <= i) {
                for (int i2 = 0; i2 < this.f29097o.size(); i2++) {
                    String str = this.f29097o.get(i2);
                    if (i2 == 0) {
                        sb.append(str);
                    } else {
                        sb.append(Constants.SEPARATOR_COMMA);
                        sb.append(str);
                    }
                }
            } else {
                sb.append(this.f29097o.get(i));
            }
        }
        if (z) {
            zvf0.m220368A("e_sticker", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", strMo120828r3), vwb.m200311Y("topic_content", sb.toString()));
        } else {
            zvf0.m220399u("e_sticker", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", strMo120828r3), vwb.m200311Y("topic_content", sb.toString()));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m45297q() {
        if (this.f29095m && (m45295o() instanceof MessagesAct)) {
            ((MessagesAct) m45295o()).m48980w2().mo103201Q1(true, new Runnable() { // from class: l.on7
                @Override // java.lang.Runnable
                public final void run() {
                    CoreCommendHintEmojiView.m45275a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m45298r() {
        setBackgroundColor(0);
        m45292E(Boolean.FALSE);
        xdl0.m208344M(this.f29085c, false);
        xdl0.m208344M(this.f29086d, true);
    }

    /* JADX INFO: renamed from: s */
    public void m45299s() {
        setBackgroundColor(-1);
        m45306z();
        m45288A();
        m45292E(Boolean.TRUE);
        xdl0.m208344M(this.f29086d, false);
        if (NullChecker.m81303a(this.f29092j)) {
            this.f29092j.call(Boolean.FALSE);
        }
    }

    public void setHintStickers(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        List<String> list2 = this.f29097o;
        if (list2 == null) {
            this.f29097o = new ArrayList();
        } else {
            list2.clear();
        }
        this.f29097o.addAll(list);
        m45289B(this.f29097o, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m45300t(Context context) {
        this.f29089g = new C8325a(m45295o(), new e30() { // from class: l.nn7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139700a.m45301u((Sticker) obj);
            }
        });
        this.f29085c.setPadding(t100.m186890d(9.0f), 1, 0, 0);
        this.f29085c.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f29085c.setAdapter(this.f29089g);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m45301u(Sticker sticker) {
        if (this.f29095m) {
            m45290C(sticker);
        } else {
            m45305y(sticker, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m45302v(String str, List list) {
        if (vwb.m200296J(list) || TextUtils.isEmpty(this.f29091i.getText().toString())) {
            return;
        }
        zvf0.m220368A("e_gif_recommend", this.f29094l, vwb.m200311Y("search_word", str), vwb.m200311Y("gif_recommend_scene", "comment"));
        this.f29089g.m45316N(str);
        setBackgroundColor(-1);
        xdl0.m208344M(this.f29085c, true);
        m45292E(Boolean.TRUE);
        this.f29083a.setBackgroundColor(0);
        if (list.size() > 10) {
            list = list.subList(0, 10);
        }
        this.f29089g.m45315M(list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m45303w(View view) {
        m45299s();
        this.f29092j.call(Boolean.FALSE);
        final String string = this.f29091i.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m45295o().duringCreated(CoreModule.f17545c.f19624Z.m34924p3(string)).subscribe(mkd0.m154956H(new e30() { // from class: l.pn7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150369a.m45302v(string, (List) obj);
            }
        }, new e30() { // from class: l.qn7
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m45277c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m45304x(boolean z, List list, List list2) {
        if (this.f29096n || (TextUtils.isEmpty(this.f29091i.getText().toString()) && z)) {
            m45292E(Boolean.TRUE);
            return;
        }
        if (vwb.m200296J(list2)) {
            if (this.f29095m) {
                m45297q();
                return;
            }
            return;
        }
        String str = list.size() == 1 ? (String) list.get(0) : "";
        zvf0.m220368A("e_gif_recommend", this.f29094l, vwb.m200311Y("search_word", str), vwb.m200311Y("gif_recommend_scene", "comment"));
        setVisibility(0);
        this.f29089g.m45316N(str);
        setBackgroundColor(-1);
        xdl0.m208344M(this.f29085c, true);
        m45292E(Boolean.TRUE);
        this.f29083a.setBackgroundColor(0);
        if (list2.size() > 10) {
            list2 = list2.subList(0, 10);
        }
        this.f29089g.m45315M(list2);
        if (this.f29095m) {
            m45296p(true, -1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m45305y(Object obj, Media media) {
        if (media == null && obj == null) {
            return;
        }
        if (NullChecker.m81303a(media)) {
            setVisibility(0);
            m45288A();
            this.f29092j.call(Boolean.TRUE);
            this.f29083a.setBackgroundColor(0);
            setBackgroundColor(0);
            this.f29099q = media;
            m45298r();
            qib0.f154691G.m102325I0(this.f29087e, media.url, t100.m186890d(64.0f), t100.m186890d(64.0f));
            return;
        }
        Sticker sticker = obj instanceof Sticker ? (Sticker) obj : null;
        if (sticker == null) {
            return;
        }
        setVisibility(0);
        this.f29092j.call(Boolean.TRUE);
        this.f29083a.setBackgroundColor(0);
        setBackgroundColor(0);
        m45298r();
        m45306z();
        this.f29098p = sticker.cloneSticker();
        if (TEnum.equals(sticker.source, "shanmeng")) {
            qib0.f154691G.m102325I0(this.f29087e, sticker.pictures.get(0).url, t100.m186890d(64.0f), t100.m186890d(64.0f));
        } else {
            qib0.f154691G.m102312B0(this.f29087e, m45293F(sticker.pictures.get(0)));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m45306z() {
        this.f29099q = null;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29094l = "p_user_moment_interactions_details_view";
        this.f29095m = false;
        this.f29096n = false;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29094l = "p_user_moment_interactions_details_view";
        this.f29095m = false;
        this.f29096n = false;
    }
}
