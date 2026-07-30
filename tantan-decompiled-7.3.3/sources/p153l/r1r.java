package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.KeyboardPagerAdapterPage;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(19)
public class r1r extends lb2 implements KeyboardPagerAdapterPage.InterfaceC8703b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public final List<String> f160848e;

    /* JADX INFO: renamed from: f */
    public final y20<CharSequence> f160849f;

    public r1r(List<String> list, y20<CharSequence> y20Var) {
        this.f160848e = list;
        this.f160849f = y20Var;
    }

    @Override // p153l.cf60
    public int getCount() {
        return (int) Math.ceil(((double) this.f160848e.size()) / 31.0d);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f160849f.call((CharSequence) view.getTag());
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        List<String> listM179436r = m179436r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m50427b(8, 4, viewGroup.getContext().getResources().getDimensionPixelSize(eac0.f92763k), listM179436r, this, true);
        viewGroup.addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8703b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo50432i(String str, Context context) {
        View viewInflate = p9r.m171370a(context).inflate(qec0.f157098p5, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(edc0.f93168A4)).setText(hxj0.m137614c(str));
        viewInflate.setTag(str);
        viewInflate.setOnClickListener(this);
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public final List<String> m179436r(int i) {
        int i2 = i * 31;
        return this.f160848e.subList(i2, Math.min(i2 + 31, this.f160848e.size()));
    }
}
