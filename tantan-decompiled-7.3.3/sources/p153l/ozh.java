package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ozh implements iam<izh>, d0r {

    /* JADX INFO: renamed from: A */
    public static final int f149885A;

    /* JADX INFO: renamed from: B */
    public static final int f149886B;

    /* JADX INFO: renamed from: r */
    public static final int f149887r;

    /* JADX INFO: renamed from: s */
    public static final int f149888s;

    /* JADX INFO: renamed from: t */
    public static final int f149889t;

    /* JADX INFO: renamed from: u */
    public static final int f149890u;

    /* JADX INFO: renamed from: v */
    public static final int f149891v;

    /* JADX INFO: renamed from: w */
    public static final int f149892w;

    /* JADX INFO: renamed from: x */
    public static final int f149893x;

    /* JADX INFO: renamed from: y */
    public static final int f149894y;

    /* JADX INFO: renamed from: z */
    public static final int f149895z;

    /* JADX INFO: renamed from: a */
    public VFrame f149896a;

    /* JADX INFO: renamed from: b */
    public VLinear f149897b;

    /* JADX INFO: renamed from: c */
    public VRelative f149898c;

    /* JADX INFO: renamed from: d */
    public View f149899d;

    /* JADX INFO: renamed from: e */
    public View f149900e;

    /* JADX INFO: renamed from: f */
    public VText f149901f;

    /* JADX INFO: renamed from: g */
    public VText f149902g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f149903h;

    /* JADX INFO: renamed from: i */
    public VEditText f149904i;

    /* JADX INFO: renamed from: j */
    public TextView f149905j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f149906k;

    /* JADX INFO: renamed from: l */
    public VText f149907l;

    /* JADX INFO: renamed from: m */
    public izh f149908m;

    /* JADX INFO: renamed from: n */
    public FeedSelectAndPostStatusAct f149909n;

    /* JADX INFO: renamed from: o */
    public rzh f149910o;

    /* JADX INFO: renamed from: p */
    public boolean f149911p;

    /* JADX INFO: renamed from: q */
    public h80 f149912q = new C19255b();

    /* JADX INFO: renamed from: l.ozh$c */
    public class C19256c extends GridLayoutManager.AbstractC0554c {
        public C19256c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return ozh.this.f149910o.mo180208F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.ozh$d */
    public class C19257d extends RecyclerView.AbstractC0578n {
        public C19257d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!ozh.this.f149910o.mo180208F(childAdapterPosition)) {
                rect.left = ozh.f149894y;
                rect.right = ozh.f149894y;
                rect.top = ozh.f149895z;
                rect.bottom = ozh.f149895z;
                return;
            }
            int iM175859d = ozh.f149885A;
            if (childAdapterPosition == 0) {
                iM175859d += qa00.m175859d(8.0f);
            }
            rect.top = iM175859d;
            rect.bottom = ozh.f149886B;
            rect.left = ozh.f149894y;
            rect.right = ozh.f149894y;
        }
    }

    static {
        int iM175859d = qa00.m175859d(8.0f);
        f149887r = iM175859d;
        int iM175859d2 = qa00.m175859d(8.0f);
        f149888s = iM175859d2;
        int iM175859d3 = qa00.m175859d(22.0f);
        f149889t = iM175859d3;
        int iM175859d4 = qa00.m175859d(11.0f);
        f149890u = iM175859d4;
        int iM175859d5 = qa00.m175859d(20.0f);
        f149891v = iM175859d5;
        f149892w = iM175859d5 - (iM175859d2 / 2);
        f149893x = qa00.m175859d(52.0f);
        int i = iM175859d / 2;
        f149894y = i;
        f149895z = iM175859d2 / 2;
        f149885A = iM175859d3 - i;
        f149886B = iM175859d4 - i;
    }

    public ozh(FeedSelectAndPostStatusAct feedSelectAndPostStatusAct) {
        this.f149909n = feedSelectAndPostStatusAct;
    }

    /* JADX INFO: renamed from: C */
    private void m169935C() {
        i4g0.m138492A("e_set_my_state_post", "p_set_my_state_post", pf60.m172085a("source_page", this.f149909n.f43819l));
        boolean zM111177E = cmg.m111177E();
        VText vText = this.f149902g;
        if (zM111177E) {
            vText.setText("24小时后将自动消失");
            this.f149901f.setText("发布此刻状态");
        } else {
            vText.setText("仅好友可见，24小时后将自动消失");
            this.f149901f.setText("发布我的状态");
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s */
    private void m169946s() {
        this.f149904i.setFilters(new InputFilter[]{new b4h(30)});
        this.f149904i.addTextChangedListener(new C19254a());
        bnl0.m105509E0(this.f149907l, new View.OnClickListener() { // from class: l.jzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123262a.m169948v(view);
            }
        });
        bnl0.m105509E0(this.f149905j, new View.OnClickListener() { // from class: l.kzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129417a.m169949w(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m169947u() {
        rzh rzhVar = new rzh(this.f149909n, "p_set_my_state_post", this.f149912q);
        this.f149910o = rzhVar;
        rzhVar.m183753N(new y20() { // from class: l.lzh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134191a.m169957x((Emotion) obj);
            }
        });
        this.f149906k.setAdapter(this.f149910o);
        this.f149906k.addItemDecoration(new C19257d());
        RecyclerView recyclerView = this.f149906k;
        int i = f149892w;
        recyclerView.setPadding(i, 0, i, f149893x);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f149909n, 4);
        gridLayoutManager.m3327v(new C19256c());
        this.f149906k.setLayoutManager(gridLayoutManager);
        this.f149906k.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m169948v(View view) {
        m169952E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m169949w(View view) {
        m169952E();
    }

    /* JADX INFO: renamed from: A */
    public void m169950A(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        this.f149903h.m224133x(emotion.emojiUrl, 1);
    }

    /* JADX INFO: renamed from: B */
    public void m169951B(BubbleInfo bubbleInfo) {
        Emotion emotion;
        if (bubbleInfo == null || (emotion = bubbleInfo.emotion) == null) {
            return;
        }
        this.f149909n.f43815h = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m169950A(emotion);
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f149904i.setText(bubbleInfo.value);
        }
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m169952E() {
        if (!Network.isConnected(this.f149909n)) {
            r1j0.m179420g("网络异常");
            return;
        }
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = this.f149909n;
        if (feedSelectAndPostStatusAct.f43815h == null) {
            return;
        }
        i4g0.m138523u("e_set_my_state_post", "p_set_my_state_post", pf60.m172085a("source_page", feedSelectAndPostStatusAct.f43819l));
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f149904i.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f149909n.f43815h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f149909n.f43815h.backgroundColor;
        if (cmg.m111177E()) {
            textTheme.iconColor = this.f149909n.f43815h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (TextUtils.isEmpty(string)) {
            m169958y(bubbleInfo);
        } else {
            this.f149908m.m142808g0(string, new x20() { // from class: l.mzh
                @Override // p153l.x20
                public final void call() {
                    this.f139519a.m169958y(bubbleInfo);
                }
            });
        }
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f149909n;
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (i <= 0) {
            this.f149911p = false;
            bnl0.m105524M(this.f149905j, false);
        } else {
            this.f149911p = true;
            bnl0.m105524M(this.f149905j, !TextUtils.isEmpty(this.f149904i.getText().toString().trim()));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM169953m = m169953m(layoutInflater, viewGroup);
        TextPaint paint = this.f149901f.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        m169946s();
        m169935C();
        m169947u();
        m169954n();
        return viewM169953m;
    }

    /* JADX INFO: renamed from: m */
    public View m169953m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pzh.m174435b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m169954n() {
        f0r f0rVar = new f0r(getAct());
        f0rVar.m123509g(this);
        this.f149909n.getWindow().getDecorView().post(new kqg(f0rVar));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(izh izhVar) {
        this.f149908m = izhVar;
    }

    /* JADX INFO: renamed from: q */
    public void m169956q() {
        this.f149910o.m183752M(this.f149908m.f117703b);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m169957x(Emotion emotion) {
        this.f149909n.f43815h = emotion;
        m169950A(emotion);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m169958y(BubbleInfo bubbleInfo) {
        this.f149909n.hideInput(this.f149904i);
        this.f149908m.m142809k0(bubbleInfo);
        this.f149909n.lambda$debugItems$19();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ozh$b */
    public class C19255b extends h80<uzh> {
        public C19255b() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(uzh uzhVar, int i) {
            if (NullChecker.m82486a(uzhVar) && NullChecker.m82486a(uzhVar.m198834b())) {
                i4g0.m138492A("e_set_my_state_type", "p_set_my_state_post", jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(uzh uzhVar, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: l.ozh$a */
    public class C19254a implements TextWatcher {
        public C19254a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z = false;
            if (ozh.this.f149904i.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = ozh.this.f149904i.getSelectionStart();
                ozh.this.f149904i.setText((selectionStart != ozh.this.f149904i.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = ozh.this.f149904i;
                vEditText.setSelection(vEditText.getText().length());
                l51.m152887G(new Runnable() { // from class: l.nzh
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165636j("最多输入3行");
                    }
                });
            }
            TextView textView = ozh.this.f149905j;
            if (editable.toString().trim().length() > 0 && ozh.this.f149911p) {
                z = true;
            }
            bnl0.m105524M(textView, z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
