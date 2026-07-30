package p007l;

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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dyq;
import l.e30;
import l.e51;
import l.fyq;
import l.j760;
import l.lsi0;
import l.osi0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.AutoVDraweeView;
import v.VEditText;
import v.VFrame;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zxh implements s7m<txh>, dyq {

    /* JADX INFO: renamed from: A */
    public static final int f15873A;

    /* JADX INFO: renamed from: B */
    public static final int f15874B;

    /* JADX INFO: renamed from: r */
    public static final int f15875r;

    /* JADX INFO: renamed from: s */
    public static final int f15876s;

    /* JADX INFO: renamed from: t */
    public static final int f15877t;

    /* JADX INFO: renamed from: u */
    public static final int f15878u;

    /* JADX INFO: renamed from: v */
    public static final int f15879v;

    /* JADX INFO: renamed from: w */
    public static final int f15880w;

    /* JADX INFO: renamed from: x */
    public static final int f15881x;

    /* JADX INFO: renamed from: y */
    public static final int f15882y;

    /* JADX INFO: renamed from: z */
    public static final int f15883z;

    /* JADX INFO: renamed from: a */
    public VFrame f15884a;

    /* JADX INFO: renamed from: b */
    public VLinear f15885b;

    /* JADX INFO: renamed from: c */
    public VRelative f15886c;

    /* JADX INFO: renamed from: d */
    public View f15887d;

    /* JADX INFO: renamed from: e */
    public View f15888e;

    /* JADX INFO: renamed from: f */
    public VText f15889f;

    /* JADX INFO: renamed from: g */
    public VText f15890g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f15891h;

    /* JADX INFO: renamed from: i */
    public VEditText f15892i;

    /* JADX INFO: renamed from: j */
    public TextView f15893j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f15894k;

    /* JADX INFO: renamed from: l */
    public VText f15895l;

    /* JADX INFO: renamed from: m */
    public txh f15896m;

    /* JADX INFO: renamed from: n */
    public FeedSelectAndPostStatusAct f15897n;

    /* JADX INFO: renamed from: o */
    public cyh f15898o;

    /* JADX INFO: renamed from: p */
    public boolean f15899p;

    /* JADX INFO: renamed from: q */
    public l80 f15900q = new C2555b();

    /* JADX INFO: renamed from: l.zxh$c */
    public class C2556c extends GridLayoutManager.c {
        public C2556c() {
        }

        /* JADX INFO: renamed from: f */
        public int m17574f(int i) {
            return zxh.this.f15898o.mo9107F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.zxh$d */
    public class C2557d extends RecyclerView.n {
        public C2557d() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!zxh.this.f15898o.mo9107F(childAdapterPosition)) {
                rect.left = zxh.f15882y;
                rect.right = zxh.f15882y;
                rect.top = zxh.f15883z;
                rect.bottom = zxh.f15883z;
                return;
            }
            int iD = zxh.f15873A;
            if (childAdapterPosition == 0) {
                iD += t100.d(8.0f);
            }
            rect.top = iD;
            rect.bottom = zxh.f15874B;
            rect.left = zxh.f15882y;
            rect.right = zxh.f15882y;
        }
    }

    static {
        int iD = t100.d(8.0f);
        f15875r = iD;
        int iD2 = t100.d(8.0f);
        f15876s = iD2;
        int iD3 = t100.d(22.0f);
        f15877t = iD3;
        int iD4 = t100.d(11.0f);
        f15878u = iD4;
        int iD5 = t100.d(20.0f);
        f15879v = iD5;
        f15880w = iD5 - (iD2 / 2);
        f15881x = t100.d(52.0f);
        int i = iD / 2;
        f15882y = i;
        f15883z = iD2 / 2;
        f15873A = iD3 - i;
        f15874B = iD4 - i;
    }

    public zxh(FeedSelectAndPostStatusAct feedSelectAndPostStatusAct) {
        this.f15897n = feedSelectAndPostStatusAct;
    }

    /* JADX INFO: renamed from: C */
    private void m17543C() {
        zvf0.A("e_set_my_state_post", "p_set_my_state_post", new j760[]{j760.a("source_page", this.f15897n.f4432l)});
        boolean zM12207E = nkg.m12207E();
        VText vText = this.f15890g;
        if (zM12207E) {
            vText.setText("24小时后将自动消失");
            this.f15889f.setText("发布此刻状态");
        } else {
            vText.setText("仅好友可见，24小时后将自动消失");
            this.f15889f.setText("发布我的状态");
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s */
    private void m17554s() {
        this.f15892i.setFilters(new InputFilter[]{new m2h(30)});
        this.f15892i.addTextChangedListener(new C2554a());
        xdl0.E0(this.f15895l, new View.OnClickListener() { // from class: l.uxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13982a.m17556v(view);
            }
        });
        xdl0.E0(this.f15893j, new View.OnClickListener() { // from class: l.vxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14328a.m17557w(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m17555u() {
        cyh cyhVar = new cyh(this.f15897n, "p_set_my_state_post", this.f15900q);
        this.f15898o = cyhVar;
        cyhVar.m9264N(new e30() { // from class: l.wxh
            public final void call(Object obj) {
                this.f14700a.m17568x((Emotion) obj);
            }
        });
        this.f15894k.setAdapter(this.f15898o);
        this.f15894k.addItemDecoration(new C2557d());
        RecyclerView recyclerView = this.f15894k;
        int i = f15880w;
        recyclerView.setPadding(i, 0, i, f15881x);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f15897n, 4);
        gridLayoutManager.v(new C2556c());
        this.f15894k.setLayoutManager(gridLayoutManager);
        this.f15894k.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m17556v(View view) {
        m17561E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m17557w(View view) {
        m17561E();
    }

    /* JADX INFO: renamed from: A */
    public void m17558A(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        this.f15891h.x(emotion.emojiUrl, 1);
    }

    /* JADX INFO: renamed from: B */
    public void m17559B(BubbleInfo bubbleInfo) {
        Emotion emotion;
        if (bubbleInfo == null || (emotion = bubbleInfo.emotion) == null) {
            return;
        }
        this.f15897n.f4428h = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m17558A(emotion);
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f15892i.setText(bubbleInfo.value);
        }
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17560C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m17561E() {
        if (!Network.isConnected(this.f15897n)) {
            osi0.g("网络异常");
            return;
        }
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = this.f15897n;
        if (feedSelectAndPostStatusAct.f4428h == null) {
            return;
        }
        zvf0.u("e_set_my_state_post", "p_set_my_state_post", new j760[]{j760.a("source_page", feedSelectAndPostStatusAct.f4432l)});
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f15892i.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f15897n.f4428h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f15897n.f4428h.backgroundColor;
        if (nkg.m12207E()) {
            textTheme.iconColor = this.f15897n.f4428h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (TextUtils.isEmpty(string)) {
            m17569y(bubbleInfo);
        } else {
            this.f15896m.m14682g0(string, new d30() { // from class: l.xxh
                public final void call() {
                    this.f15177a.m17569y(bubbleInfo);
                }
            });
        }
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f15897n;
    }

    /* JADX INFO: renamed from: h */
    public void m17562h(int i, int i2) {
        if (i <= 0) {
            this.f15899p = false;
            xdl0.M(this.f15893j, false);
        } else {
            this.f15899p = true;
            xdl0.M(this.f15893j, !TextUtils.isEmpty(this.f15892i.getText().toString().trim()));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM17564m = m17564m(layoutInflater, viewGroup);
        TextPaint paint = this.f15889f.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        m17554s();
        m17543C();
        m17555u();
        m17565n();
        return viewM17564m;
    }

    /* JADX INFO: renamed from: m */
    public View m17564m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ayh.m8623b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m17565n() {
        fyq fyqVar = new fyq(act());
        fyqVar.g(this);
        this.f15897n.getWindow().getDecorView().post(new vog(fyqVar));
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m17563i1(txh txhVar) {
        this.f15896m = txhVar;
    }

    /* JADX INFO: renamed from: q */
    public void m17567q() {
        this.f15898o.m9263M(this.f15896m.f13466b);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m17568x(Emotion emotion) {
        this.f15897n.f4428h = emotion;
        m17558A(emotion);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m17569y(BubbleInfo bubbleInfo) {
        this.f15897n.hideInput(this.f15892i);
        this.f15896m.m14683k0(bubbleInfo);
        this.f15897n.finish();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zxh$b */
    public class C2555b extends l80<fyh> {
        public C2555b() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(fyh fyhVar, int i) {
            if (NullChecker.a(fyhVar) && NullChecker.a(fyhVar.m10328b())) {
                zvf0.A("e_set_my_state_type", "p_set_my_state_post", new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(fyh fyhVar, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: l.zxh$a */
    public class C2554a implements TextWatcher {
        public C2554a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z = false;
            if (zxh.this.f15892i.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = zxh.this.f15892i.getSelectionStart();
                zxh.this.f15892i.setText((selectionStart != zxh.this.f15892i.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = zxh.this.f15892i;
                vEditText.setSelection(vEditText.getText().length());
                e51.G(new Runnable() { // from class: l.yxh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.j("最多输入3行");
                    }
                });
            }
            TextView textView = zxh.this.f15893j;
            if (editable.toString().trim().length() > 0 && zxh.this.f15899p) {
                z = true;
            }
            xdl0.M(textView, z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
