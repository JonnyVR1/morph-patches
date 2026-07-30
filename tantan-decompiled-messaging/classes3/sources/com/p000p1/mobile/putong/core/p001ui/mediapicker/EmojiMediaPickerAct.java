package com.p000p1.mobile.putong.core.p001ui.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import l.lsi0;
import l.xdl0;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EmojiMediaPickerAct extends MediaPickerAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m829w2(View view) {
        if (this.f531z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.h, this.f531z);
            setResult(-1, intent);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m830y2(Bundle bundle) {
        setTitle(R.string.j4);
        this.f516B.f2783k.setOnClickListener(new View.OnClickListener() { // from class: l.aye
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2322a.m829w2(view);
            }
        });
        mo831f();
        this.f516B.f2782j.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct, p003l.gwl
    /* JADX INFO: renamed from: f */
    public void mo831f() {
        String str;
        int size = this.f531z.size();
        xdl0.y(this.f516B.f2783k, size > 0);
        AppCompatTextView appCompatTextView = this.f516B.f2783k;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.i4));
        if (size <= 0) {
            str = "";
        } else {
            str = "(" + size + ")";
        }
        sb.append(str);
        appCompatTextView.setText(sb.toString());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct, p003l.gwl
    /* JADX INFO: renamed from: i */
    public boolean mo832i(Media media, boolean z) {
        boolean z2 = true;
        if (!z) {
            this.f531z.remove(media);
        } else if (this.f517l == this.f531z.size()) {
            lsi0.h(R.string.l4);
            z2 = false;
        } else {
            this.f531z.add(media);
        }
        mo831f();
        return z2;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.zxe
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9499a.m830y2((Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct, p003l.gwl
    /* JADX INFO: renamed from: j */
    public void mo833j(View view, Media media) {
        boolean z = this.f531z.indexOf(media) == -1;
        if (mo832i(media, z)) {
            ((MediaItemView) view).f511e.m11476e(z, true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f528w = getIntent().getIntExtra("spanCount", 3);
    }
}
