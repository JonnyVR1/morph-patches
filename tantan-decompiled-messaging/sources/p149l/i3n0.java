package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;

/* JADX INFO: loaded from: classes13.dex */
public class i3n0 extends i9t {

    /* JADX INFO: renamed from: d */
    public TextView f111349d;

    /* JADX INFO: renamed from: e */
    public TextView f111350e;

    /* JADX INFO: renamed from: f */
    public TextView f111351f;

    /* JADX INFO: renamed from: g */
    public TextView f111352g;

    /* JADX INFO: renamed from: h */
    public Act f111353h;

    /* JADX INFO: renamed from: i */
    public d30 f111354i;

    /* JADX INFO: renamed from: l.i3n0$a */
    public class C17476a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f111355a;

        public C17476a(String[] strArr) {
            this.f111355a = strArr;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            j2e0.m139446m(i3n0.this.f111353h, Uri.parse(this.f111355a[1]));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(i3n0.this.f111353h.getResources().getColor(g1c0.f100160o));
            textPaint.setUnderlineText(false);
        }
    }

    public i3n0(@NonNull Context context, d30 d30Var) {
        super(context, LayoutInflater.from(context).inflate(s6c0.f162766j2, (ViewGroup) null));
        this.f111354i = d30Var;
        m134267A();
    }

    /* JADX INFO: renamed from: A */
    private void m134267A() {
        m134275z(m135089u());
        xdl0.m208329E0(this.f111351f, new View.OnClickListener() { // from class: l.g3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100485a.m134268C(view);
            }
        });
        this.f111352g.setOnClickListener(new View.OnClickListener() { // from class: l.h3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105751a.m134269D(view);
            }
        });
        if (vdt.m198092b(3)) {
            this.f111349d.setText("群主须知");
            this.f111350e.setText("1、群主应当履行对群里的监督管理职责，严格依据相关法律法规、实时群聊社区规范等相关规定闺房群聊成员的行为和信息发布；\n2、群主应当积极维护群内的聊天只需，营造良好的交流氛围，提供积极健康的聊天话题，并且及时处理群成员之间的矛盾，维护群聊的安全、健康，保证群成员的使用体验。");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m134268C(View view) {
        d30 d30Var = this.f111354i;
        if (d30Var == null) {
            s9s.f163232f.m134369b(this.f111353h, null);
        } else {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m134269D(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m134270F(Act act, String str, d30 d30Var) {
        String strM112919b = dpn0.m112919b(100019);
        hfw.m130790a("EnterRoomChecker", "isInterceptStartVoiceLives");
        if (MomentAllowForwardState.allow.equals(strM112919b)) {
            i3n0 i3n0Var = new i3n0(act, d30Var);
            i3n0Var.f111353h = act;
            i3n0Var.m134274E(str);
            if (i3n0Var.isShowing()) {
                return;
            }
            i3n0Var.show();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m134274E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length > 0) {
            spannableStringBuilder.append((CharSequence) strArrSplit[0]);
        }
        if (strArrSplit.length > 2) {
            spannableStringBuilder.append((CharSequence) strArrSplit[2]);
            spannableStringBuilder.setSpan(new C17476a(strArrSplit), strArrSplit[0].length(), strArrSplit[0].length() + strArrSplit[2].length(), 33);
        }
        if (strArrSplit.length > 3) {
            spannableStringBuilder.append((CharSequence) strArrSplit[3]);
        }
        this.f111350e.setText(spannableStringBuilder);
        this.f111350e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f111350e.setHighlightColor(0);
    }

    @Override // p149l.i9t, android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: renamed from: z */
    public final void m134275z(View view) {
        j3n0.m139595a(this, view);
    }
}
