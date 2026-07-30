package com.p051p1.mobile.putong.core.p058ui.emoji;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreCommendHintEmojiView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.bp7;
import p153l.clz;
import p153l.dbc0;
import p153l.edc0;
import p153l.g96;
import p153l.gra;
import p153l.h39;
import p153l.i4g0;
import p153l.jic0;
import p153l.jyb;
import p153l.niw;
import p153l.psd0;
import p153l.qa00;
import p153l.qec0;
import p153l.uqb0;
import p153l.vo7;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class CoreCommendHintEmojiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29931a;

    /* JADX INFO: renamed from: b */
    public View f29932b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f29933c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f29934d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29935e;

    /* JADX INFO: renamed from: f */
    public VImage f29936f;

    /* JADX INFO: renamed from: g */
    public C8488a f29937g;

    /* JADX INFO: renamed from: h */
    public C8489b f29938h;

    /* JADX INFO: renamed from: i */
    public EditText f29939i;

    /* JADX INFO: renamed from: j */
    public y20<Boolean> f29940j;

    /* JADX INFO: renamed from: k */
    public boolean f29941k;

    /* JADX INFO: renamed from: l */
    public String f29942l;

    /* JADX INFO: renamed from: m */
    public boolean f29943m;

    /* JADX INFO: renamed from: n */
    public boolean f29944n;

    /* JADX INFO: renamed from: o */
    public List<String> f29945o;

    /* JADX INFO: renamed from: p */
    public StickerInfo f29946p;

    /* JADX INFO: renamed from: q */
    public Media f29947q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$a */
    public class C8488a extends jic0<Sticker> {

        /* JADX INFO: renamed from: c */
        public final List<Sticker> f29948c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final y20<Sticker> f29949d;

        /* JADX INFO: renamed from: e */
        public Act f29950e;

        /* JADX INFO: renamed from: f */
        public String f29951f;

        public C8488a(Act act, y20<Sticker> y20Var) {
            this.f29949d = y20Var;
            this.f29950e = act;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (this.f29948c.size() == 0) {
                return 0;
            }
            return this.f29948c.size() + (!CoreCommendHintEmojiView.this.f29943m ? 1 : 0);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(qec0.f156840E0, (ViewGroup) null);
            }
            VImage vImage = new VImage(viewGroup.getContext());
            vImage.setImageResource(gra.m131778z() ? dbc0.f86948e8 : dbc0.f86916d8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qa00.m175859d(56.0f), qa00.m175859d(56.0f));
            layoutParams.rightMargin = qa00.m175859d(100.0f);
            vImage.setLayoutParams(layoutParams);
            return vImage;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, final Sticker sticker, int i, final int i2) {
            if (i == 0) {
                bnl0.m105522L(view, new View.OnClickListener() { // from class: l.yo7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f200958a.m46496K(view, view2);
                    }
                });
                return;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(edc0.f93179C1);
            CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
            if (!NullChecker.m82486a(sticker) || sticker.pictures.isEmpty()) {
                uqb0.f180374G.m98798o(vDraweeView);
                return;
            }
            frameLayout.setTag(sticker);
            if (TEnum.equals(sticker.source, "shanmeng")) {
                uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).url);
                sticker.hash = niw.m163315e(sticker.pictures.get(0).url);
            } else {
                uqb0.f180374G.m127096B0(vDraweeView, m46500O(sticker.pictures.get(0)));
            }
            bnl0.m105522L(frameLayout, new View.OnClickListener() { // from class: l.zo7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f205298a.m46497L(sticker, i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == this.f29948c.size()) {
                return null;
            }
            return this.f29948c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m46495J(int i, int i2, int i3, Intent intent) {
            if (i2 != i || i3 != -1 || !NullChecker.m82486a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f32710o);
            if (!NullChecker.m82486a(this.f29949d)) {
                return true;
            }
            this.f29949d.call(sticker);
            return true;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m46496K(View view, View view2) {
            i4g0.m138520r("e_gif_search", CoreCommendHintEmojiView.this.f29942l);
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f32705j, true);
            final int i = 10003;
            this.f29950e.startActivityForResult(10003, intent, new C4468a.a() { // from class: l.ap7
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i2, int i3, Intent intent2) {
                    return this.f72690a.m46495J(i, i2, i3, intent2);
                }
            });
            this.f29950e.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m46497L(Sticker sticker, int i, View view) {
            i4g0.m138523u("e_gif_recommend", CoreCommendHintEmojiView.this.f29942l, jyb.m147494Y("search_word", this.f29951f), jyb.m147494Y("gif_recommend_scene", "comment"));
            if (NullChecker.m82486a(this.f29949d)) {
                this.f29949d.call(sticker);
            }
            if (CoreCommendHintEmojiView.this.f29943m) {
                CoreCommendHintEmojiView.this.m46479p(false, i);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m46498M(List<Sticker> list) {
            this.f29948c.clear();
            this.f29948c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public void m46499N(String str) {
            this.f29951f = str;
        }

        /* JADX INFO: renamed from: O */
        public Picture.ImageUri m46500O(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == this.f29948c.size() ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView$b */
    public class C8489b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public Act f29953a;

        /* JADX INFO: renamed from: b */
        public C8488a f29954b;

        /* JADX INFO: renamed from: c */
        public RecyclerView f29955c;

        /* JADX INFO: renamed from: d */
        public RelativeLayout f29956d;

        public C8489b(Act act, C8488a c8488a, RelativeLayout relativeLayout, RecyclerView recyclerView) {
            this.f29953a = act;
            this.f29954b = c8488a;
            this.f29956d = relativeLayout;
            this.f29955c = recyclerView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (bnl0.m105529O0(this.f29956d)) {
                return;
            }
            CoreCommendHintEmojiView.this.m46472B(editable != null ? jyb.m147482M(editable == null ? null : editable.toString()) : null, true);
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
        this.f29942l = "p_user_moment_interactions_details_view";
        this.f29943m = false;
        this.f29944n = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46458a() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m46460c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m46461d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m46463f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m46471A() {
        this.f29946p = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m46472B(final List<String> list, final boolean z) {
        this.f29944n = jyb.m147479J(list);
        if (jyb.m147479J(list) || (TextUtils.isEmpty(this.f29939i.getText().toString()) && z)) {
            this.f29937g.m46498M(new ArrayList());
            bnl0.m105524M(this.f29933c, false);
            m46480q();
            m46475E(Boolean.TRUE);
            return;
        }
        if (this.f29943m && (list.get(0).length() > 4 || (z && TextUtils.isEmpty(list.get(0))))) {
            m46480q();
        } else if (list.get(0).length() > 10) {
            return;
        }
        m46478o().duringCreated(CoreModule.f18264c.f20366Z.m35925n3(list, z)).subscribe(psd0.m173597H(new y20() { // from class: l.po7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153370a.m46487x(z, list, (List) obj);
            }
        }, new y20() { // from class: l.qo7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m46461d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m46473C(Sticker sticker) {
        if (m46478o() instanceof MessagesAct) {
            final clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) m46478o()).mo50158l();
            this.f29939i.setText("");
            m46480q();
            m46478o().duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35955Q(sticker.cloneSticker()).filter(new vo7()).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.wo7
                @Override // p153l.y20
                public final void call(Object obj) {
                    clzVarMo50158l.m110909R6((Sticker) obj, false);
                }
            }, new y20() { // from class: l.xo7
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreCommendHintEmojiView.m46463f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m46474D(EditText editText, boolean z, y20<Boolean> y20Var, boolean z2) {
        this.f29939i = editText;
        this.f29940j = y20Var;
        this.f29941k = z;
        this.f29943m = z2 && h39.m133428Q();
        C8489b c8489b = new C8489b(m46478o(), this.f29937g, this.f29934d, this.f29933c);
        this.f29938h = c8489b;
        this.f29939i.addTextChangedListener(c8489b);
        if (!this.f29943m) {
            m46475E(Boolean.valueOf(z));
            return;
        }
        clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) m46478o()).mo50158l();
        if (NullChecker.m82486a(editText) && NullChecker.m82486a(editText.getText()) && !TextUtils.isEmpty(editText.getText().toString())) {
            m46472B(jyb.m147482M(editText.getText().toString()), true);
            clzVarMo50158l.f82467U = true;
        } else if (!clzVarMo50158l.f82467U) {
            List<String> listM129515b = g96.m129515b(h39.m133436Y().hint_emoji_array, 5);
            this.f29945o = listM129515b;
            m46472B(listM129515b, false);
            clzVarMo50158l.f82467U = true;
        }
        this.f29942l = m46478o().pageId();
        m46475E(Boolean.FALSE);
        bnl0.m105540X(this.f29933c, qa00.f156323j);
        this.f29933c.setPadding(qa00.m175859d(16.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: E */
    public final void m46475E(Boolean bool) {
        boolean z = this.f29943m;
        View view = this.f29932b;
        if (z) {
            bnl0.m105524M(view, false);
        } else {
            bnl0.m105524M(view, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public Picture.ImageUri m46476F(Picture picture) {
        return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
    }

    public Object getSelectStickerInfoOrMedia() {
        if (NullChecker.m82486a(this.f29946p)) {
            return this.f29946p;
        }
        if (NullChecker.m82486a(this.f29947q)) {
            return this.f29947q;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m46477n(View view) {
        bp7.m105788a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public Act m46478o() {
        return (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f29938h) && NullChecker.m82486a(this.f29939i)) {
            this.f29939i.removeTextChangedListener(this.f29938h);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m46477n(this);
        m46483t(m46478o());
        bnl0.m105509E0(this.f29936f, new View.OnClickListener() { // from class: l.oo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148328a.m46486w(view);
            }
        });
        CoreModule.m30932N().mo61467In(this.f29934d, this.f29936f);
        CoreModule.m30932N().mo61494R9(this.f29935e, 10.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m46479p(boolean z, int i) {
        String strMo111034r3 = ((MessagesAct) m46478o()).mo50158l().mo111034r3();
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m82486a(this.f29939i.getText()) && !TextUtils.isEmpty(this.f29939i.getText().toString())) {
            sb.append(this.f29939i.getText().toString());
        } else if (!jyb.m147479J(this.f29945o)) {
            if (z || i < 0 || this.f29945o.size() <= i) {
                for (int i2 = 0; i2 < this.f29945o.size(); i2++) {
                    String str = this.f29945o.get(i2);
                    if (i2 == 0) {
                        sb.append(str);
                    } else {
                        sb.append(Constants.SEPARATOR_COMMA);
                        sb.append(str);
                    }
                }
            } else {
                sb.append(this.f29945o.get(i));
            }
        }
        if (z) {
            i4g0.m138492A("e_sticker", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", strMo111034r3), jyb.m147494Y("topic_content", sb.toString()));
        } else {
            i4g0.m138523u("e_sticker", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", strMo111034r3), jyb.m147494Y("topic_content", sb.toString()));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m46480q() {
        if (this.f29943m && (m46478o() instanceof MessagesAct)) {
            ((MessagesAct) m46478o()).m50164y2().mo178911Q1(true, new Runnable() { // from class: l.so7
                @Override // java.lang.Runnable
                public final void run() {
                    CoreCommendHintEmojiView.m46458a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m46481r() {
        setBackgroundColor(0);
        m46475E(Boolean.FALSE);
        bnl0.m105524M(this.f29933c, false);
        bnl0.m105524M(this.f29934d, true);
    }

    /* JADX INFO: renamed from: s */
    public void m46482s() {
        setBackgroundColor(-1);
        m46489z();
        m46471A();
        m46475E(Boolean.TRUE);
        bnl0.m105524M(this.f29934d, false);
        if (NullChecker.m82486a(this.f29940j)) {
            this.f29940j.call(Boolean.FALSE);
        }
    }

    public void setHintStickers(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        List<String> list2 = this.f29945o;
        if (list2 == null) {
            this.f29945o = new ArrayList();
        } else {
            list2.clear();
        }
        this.f29945o.addAll(list);
        m46472B(this.f29945o, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m46483t(Context context) {
        this.f29937g = new C8488a(m46478o(), new y20() { // from class: l.ro7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164162a.m46484u((Sticker) obj);
            }
        });
        this.f29933c.setPadding(qa00.m175859d(9.0f), 1, 0, 0);
        this.f29933c.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f29933c.setAdapter(this.f29937g);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m46484u(Sticker sticker) {
        if (this.f29943m) {
            m46473C(sticker);
        } else {
            m46488y(sticker, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m46485v(String str, List list) {
        if (jyb.m147479J(list) || TextUtils.isEmpty(this.f29939i.getText().toString())) {
            return;
        }
        i4g0.m138492A("e_gif_recommend", this.f29942l, jyb.m147494Y("search_word", str), jyb.m147494Y("gif_recommend_scene", "comment"));
        this.f29937g.m46499N(str);
        setBackgroundColor(-1);
        bnl0.m105524M(this.f29933c, true);
        m46475E(Boolean.TRUE);
        this.f29931a.setBackgroundColor(0);
        if (list.size() > 10) {
            list = list.subList(0, 10);
        }
        this.f29937g.m46498M(list);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m46486w(View view) {
        m46482s();
        this.f29940j.call(Boolean.FALSE);
        final String string = this.f29939i.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m46478o().duringCreated(CoreModule.f18264c.f20366Z.m35927p3(string)).subscribe(psd0.m173597H(new y20() { // from class: l.to7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175362a.m46485v(string, (List) obj);
            }
        }, new y20() { // from class: l.uo7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreCommendHintEmojiView.m46460c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m46487x(boolean z, List list, List list2) {
        if (this.f29944n || (TextUtils.isEmpty(this.f29939i.getText().toString()) && z)) {
            m46475E(Boolean.TRUE);
            return;
        }
        if (jyb.m147479J(list2)) {
            if (this.f29943m) {
                m46480q();
                return;
            }
            return;
        }
        String str = list.size() == 1 ? (String) list.get(0) : "";
        i4g0.m138492A("e_gif_recommend", this.f29942l, jyb.m147494Y("search_word", str), jyb.m147494Y("gif_recommend_scene", "comment"));
        setVisibility(0);
        this.f29937g.m46499N(str);
        setBackgroundColor(-1);
        bnl0.m105524M(this.f29933c, true);
        m46475E(Boolean.TRUE);
        this.f29931a.setBackgroundColor(0);
        if (list2.size() > 10) {
            list2 = list2.subList(0, 10);
        }
        this.f29937g.m46498M(list2);
        if (this.f29943m) {
            m46479p(true, -1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m46488y(Object obj, Media media) {
        if (media == null && obj == null) {
            return;
        }
        if (NullChecker.m82486a(media)) {
            setVisibility(0);
            m46471A();
            this.f29940j.call(Boolean.TRUE);
            this.f29931a.setBackgroundColor(0);
            setBackgroundColor(0);
            this.f29947q = media;
            m46481r();
            uqb0.f180374G.m127109I0(this.f29935e, media.url, qa00.m175859d(64.0f), qa00.m175859d(64.0f));
            return;
        }
        Sticker sticker = obj instanceof Sticker ? (Sticker) obj : null;
        if (sticker == null) {
            return;
        }
        setVisibility(0);
        this.f29940j.call(Boolean.TRUE);
        this.f29931a.setBackgroundColor(0);
        setBackgroundColor(0);
        m46481r();
        m46489z();
        this.f29946p = sticker.cloneSticker();
        if (TEnum.equals(sticker.source, "shanmeng")) {
            uqb0.f180374G.m127109I0(this.f29935e, sticker.pictures.get(0).url, qa00.m175859d(64.0f), qa00.m175859d(64.0f));
        } else {
            uqb0.f180374G.m127096B0(this.f29935e, m46476F(sticker.pictures.get(0)));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m46489z() {
        this.f29947q = null;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29942l = "p_user_moment_interactions_details_view";
        this.f29943m = false;
        this.f29944n = false;
    }

    public CoreCommendHintEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29942l = "p_user_moment_interactions_details_view";
        this.f29943m = false;
        this.f29944n = false;
    }
}
