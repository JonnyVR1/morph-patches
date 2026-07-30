package com.p046p1.mobile.putong.core.p053ui.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import p147v.VText;
import p149l.e30;
import p149l.lsi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class EmojiMediaPickerAct extends MediaPickerAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m47765w2(View view) {
        if (this.f30640z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.f54603h, this.f30640z);
            setResult(-1, intent);
        }
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m47766y2(Bundle bundle) {
        setTitle(R$string.f18627j4);
        this.f30625B.f82416k.setOnClickListener(new View.OnClickListener() { // from class: l.aye
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72270a.m47765w2(view);
            }
        });
        mo47767f();
        this.f30625B.f82415j.setVisibility(8);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, p149l.gwl
    /* JADX INFO: renamed from: f */
    public void mo47767f() {
        String str;
        int size = this.f30640z.size();
        xdl0.m208411y(this.f30625B.f82416k, size > 0);
        VText vText = this.f30625B.f82416k;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R$string.f18598i4));
        if (size <= 0) {
            str = "";
        } else {
            str = "(" + size + ")";
        }
        sb.append(str);
        vText.setText(sb.toString());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, p149l.gwl
    /* JADX INFO: renamed from: i */
    public boolean mo47768i(Media media, boolean z) {
        boolean z2 = true;
        if (!z) {
            this.f30640z.remove(media);
        } else if (this.f30626l == this.f30640z.size()) {
            lsi0.m151578h(R$string.f18689l4);
            z2 = false;
        } else {
            this.f30640z.add(media);
        }
        mo47767f();
        return z2;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.zxe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205403a.m47766y2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, p149l.gwl
    /* JADX INFO: renamed from: j */
    public void mo47769j(View view, Media media) {
        boolean z = this.f30640z.indexOf(media) == -1;
        if (mo47768i(media, z)) {
            ((MediaItemView) view).f30620e.m223003e(z, true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f30637w = getIntent().getIntExtra("spanCount", 3);
    }
}
