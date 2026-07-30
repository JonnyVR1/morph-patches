package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zxh implements s7m<txh>, dyq {

    /* JADX INFO: renamed from: A */
    public static final int f205411A;

    /* JADX INFO: renamed from: B */
    public static final int f205412B;

    /* JADX INFO: renamed from: r */
    public static final int f205413r;

    /* JADX INFO: renamed from: s */
    public static final int f205414s;

    /* JADX INFO: renamed from: t */
    public static final int f205415t;

    /* JADX INFO: renamed from: u */
    public static final int f205416u;

    /* JADX INFO: renamed from: v */
    public static final int f205417v;

    /* JADX INFO: renamed from: w */
    public static final int f205418w;

    /* JADX INFO: renamed from: x */
    public static final int f205419x;

    /* JADX INFO: renamed from: y */
    public static final int f205420y;

    /* JADX INFO: renamed from: z */
    public static final int f205421z;

    /* JADX INFO: renamed from: a */
    public VFrame f205422a;

    /* JADX INFO: renamed from: b */
    public VLinear f205423b;

    /* JADX INFO: renamed from: c */
    public VRelative f205424c;

    /* JADX INFO: renamed from: d */
    public View f205425d;

    /* JADX INFO: renamed from: e */
    public View f205426e;

    /* JADX INFO: renamed from: f */
    public VText f205427f;

    /* JADX INFO: renamed from: g */
    public VText f205428g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f205429h;

    /* JADX INFO: renamed from: i */
    public VEditText f205430i;

    /* JADX INFO: renamed from: j */
    public TextView f205431j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f205432k;

    /* JADX INFO: renamed from: l */
    public VText f205433l;

    /* JADX INFO: renamed from: m */
    public txh f205434m;

    /* JADX INFO: renamed from: n */
    public FeedSelectAndPostStatusAct f205435n;

    /* JADX INFO: renamed from: o */
    public cyh f205436o;

    /* JADX INFO: renamed from: p */
    public boolean f205437p;

    /* JADX INFO: renamed from: q */
    public l80 f205438q = new C21802b();

    /* JADX INFO: renamed from: l.zxh$c */
    public class C21803c extends GridLayoutManager.AbstractC0553c {
        public C21803c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return zxh.this.f205436o.mo105565F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.zxh$d */
    public class C21804d extends RecyclerView.AbstractC0576n {
        public C21804d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!zxh.this.f205436o.mo105565F(childAdapterPosition)) {
                rect.left = zxh.f205420y;
                rect.right = zxh.f205420y;
                rect.top = zxh.f205421z;
                rect.bottom = zxh.f205421z;
                return;
            }
            int iM186890d = zxh.f205411A;
            if (childAdapterPosition == 0) {
                iM186890d += t100.m186890d(8.0f);
            }
            rect.top = iM186890d;
            rect.bottom = zxh.f205412B;
            rect.left = zxh.f205420y;
            rect.right = zxh.f205420y;
        }
    }

    static {
        int iM186890d = t100.m186890d(8.0f);
        f205413r = iM186890d;
        int iM186890d2 = t100.m186890d(8.0f);
        f205414s = iM186890d2;
        int iM186890d3 = t100.m186890d(22.0f);
        f205415t = iM186890d3;
        int iM186890d4 = t100.m186890d(11.0f);
        f205416u = iM186890d4;
        int iM186890d5 = t100.m186890d(20.0f);
        f205417v = iM186890d5;
        f205418w = iM186890d5 - (iM186890d2 / 2);
        f205419x = t100.m186890d(52.0f);
        int i = iM186890d / 2;
        f205420y = i;
        f205421z = iM186890d2 / 2;
        f205411A = iM186890d3 - i;
        f205412B = iM186890d4 - i;
    }

    public zxh(FeedSelectAndPostStatusAct feedSelectAndPostStatusAct) {
        this.f205435n = feedSelectAndPostStatusAct;
    }

    /* JADX INFO: renamed from: C */
    private void m220796C() {
        zvf0.m220368A("e_set_my_state_post", "p_set_my_state_post", j760.m140076a("source_page", this.f205435n.f42971l));
        boolean zM159848E = nkg.m159848E();
        VText vText = this.f205428g;
        if (zM159848E) {
            vText.setText("24小时后将自动消失");
            this.f205427f.setText("发布此刻状态");
        } else {
            vText.setText("仅好友可见，24小时后将自动消失");
            this.f205427f.setText("发布我的状态");
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s */
    private void m220807s() {
        this.f205430i.setFilters(new InputFilter[]{new m2h(30)});
        this.f205430i.addTextChangedListener(new C21801a());
        xdl0.m208329E0(this.f205433l, new View.OnClickListener() { // from class: l.uxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178739a.m220809v(view);
            }
        });
        xdl0.m208329E0(this.f205431j, new View.OnClickListener() { // from class: l.vxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183455a.m220810w(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m220808u() {
        cyh cyhVar = new cyh(this.f205435n, "p_set_my_state_post", this.f205438q);
        this.f205436o = cyhVar;
        cyhVar.m109316N(new e30() { // from class: l.wxh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188481a.m220818x((Emotion) obj);
            }
        });
        this.f205432k.setAdapter(this.f205436o);
        this.f205432k.addItemDecoration(new C21804d());
        RecyclerView recyclerView = this.f205432k;
        int i = f205418w;
        recyclerView.setPadding(i, 0, i, f205419x);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f205435n, 4);
        gridLayoutManager.m3326v(new C21803c());
        this.f205432k.setLayoutManager(gridLayoutManager);
        this.f205432k.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m220809v(View view) {
        m220813E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m220810w(View view) {
        m220813E();
    }

    /* JADX INFO: renamed from: A */
    public void m220811A(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        this.f205429h.m222887x(emotion.emojiUrl, 1);
    }

    /* JADX INFO: renamed from: B */
    public void m220812B(BubbleInfo bubbleInfo) {
        Emotion emotion;
        if (bubbleInfo == null || (emotion = bubbleInfo.emotion) == null) {
            return;
        }
        this.f205435n.f42967h = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m220811A(emotion);
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f205430i.setText(bubbleInfo.value);
        }
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m220813E() {
        if (!Network.isConnected(this.f205435n)) {
            osi0.m165783g("网络异常");
            return;
        }
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = this.f205435n;
        if (feedSelectAndPostStatusAct.f42967h == null) {
            return;
        }
        zvf0.m220399u("e_set_my_state_post", "p_set_my_state_post", j760.m140076a("source_page", feedSelectAndPostStatusAct.f42971l));
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f205430i.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f205435n.f42967h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f205435n.f42967h.backgroundColor;
        if (nkg.m159848E()) {
            textTheme.iconColor = this.f205435n.f42967h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (TextUtils.isEmpty(string)) {
            m220819y(bubbleInfo);
        } else {
            this.f205434m.m190958g0(string, new d30() { // from class: l.xxh
                @Override // p149l.d30
                public final void call() {
                    this.f194863a.m220819y(bubbleInfo);
                }
            });
        }
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f205435n;
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (i <= 0) {
            this.f205437p = false;
            xdl0.m208344M(this.f205431j, false);
        } else {
            this.f205437p = true;
            xdl0.m208344M(this.f205431j, !TextUtils.isEmpty(this.f205430i.getText().toString().trim()));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM220814m = m220814m(layoutInflater, viewGroup);
        TextPaint paint = this.f205427f.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        m220807s();
        m220796C();
        m220808u();
        m220815n();
        return viewM220814m;
    }

    /* JADX INFO: renamed from: m */
    public View m220814m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ayh.m99544b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m220815n() {
        fyq fyqVar = new fyq(getAct());
        fyqVar.m123794g(this);
        this.f205435n.getWindow().getDecorView().post(new vog(fyqVar));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(txh txhVar) {
        this.f205434m = txhVar;
    }

    /* JADX INFO: renamed from: q */
    public void m220817q() {
        this.f205436o.m109315M(this.f205434m.f172509b);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m220818x(Emotion emotion) {
        this.f205435n.f42967h = emotion;
        m220811A(emotion);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m220819y(BubbleInfo bubbleInfo) {
        this.f205435n.hideInput(this.f205430i);
        this.f205434m.m190959k0(bubbleInfo);
        this.f205435n.lambda$debugItems$19();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zxh$b */
    public class C21802b extends l80<fyh> {
        public C21802b() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(fyh fyhVar, int i) {
            if (NullChecker.m81303a(fyhVar) && NullChecker.m81303a(fyhVar.m123767b())) {
                zvf0.m220368A("e_set_my_state_type", "p_set_my_state_post", vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(fyh fyhVar, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: l.zxh$a */
    public class C21801a implements TextWatcher {
        public C21801a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z = false;
            if (zxh.this.f205430i.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = zxh.this.f205430i.getSelectionStart();
                zxh.this.f205430i.setText((selectionStart != zxh.this.f205430i.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = zxh.this.f205430i;
                vEditText.setSelection(vEditText.getText().length());
                e51.m114742G(new Runnable() { // from class: l.yxh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151580j("最多输入3行");
                    }
                });
            }
            TextView textView = zxh.this.f205431j;
            if (editable.toString().trim().length() > 0 && zxh.this.f205437p) {
                z = true;
            }
            xdl0.m208344M(textView, z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
