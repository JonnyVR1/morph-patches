package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.KeyboardPagerAdapterPage;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(19)
public class rzq extends eb2 implements KeyboardPagerAdapterPage.InterfaceC8540b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public final List<String> f161674e;

    /* JADX INFO: renamed from: f */
    public final e30<CharSequence> f161675f;

    public rzq(List<String> list, e30<CharSequence> e30Var) {
        this.f161674e = list;
        this.f161675f = e30Var;
    }

    @Override // p149l.w660
    public int getCount() {
        return (int) Math.ceil(((double) this.f161674e.size()) / 31.0d);
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f161675f.call((CharSequence) view.getTag());
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        List<String> listM181760r = m181760r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m49244b(8, 4, viewGroup.getContext().getResources().getDimensionPixelSize(x1c0.f189056k), listM181760r, this, true);
        viewGroup.addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8540b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo49249i(String str, Context context) {
        View viewInflate = o7r.m163037a(context).inflate(l6c0.f126542p5, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(y4c0.f195933A4)).setText(eoj0.m117353c(str));
        viewInflate.setTag(str);
        viewInflate.setOnClickListener(this);
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public final List<String> m181760r(int i) {
        int i2 = i * 31;
        return this.f161674e.subList(i2, Math.min(i2 + 31, this.f161674e.size()));
    }
}
