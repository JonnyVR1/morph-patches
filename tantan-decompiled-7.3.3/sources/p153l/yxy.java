package p153l;

import android.graphics.Color;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class yxy extends rxy {

    /* JADX INFO: renamed from: i */
    public int f202017i;

    /* JADX INFO: renamed from: j */
    public int f202018j;

    /* JADX INFO: renamed from: k */
    public int f202019k;

    /* JADX INFO: renamed from: l */
    public int f202020l;

    public yxy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i, -1);
        this.f202017i = -1;
        this.f202018j = -1;
        this.f202019k = -1;
        this.f202020l = -1;
    }

    @Override // p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo100971c(messageBarActionItemView, i, i2);
        if (m183574e(2)) {
            if (m183574e(1)) {
                messageBarActionItemView.f32776a.setColorFilter(this.f202020l);
                return;
            } else {
                messageBarActionItemView.f32776a.setColorFilter(this.f202019k);
                return;
            }
        }
        if (m183574e(1)) {
            int i3 = this.f202018j;
            if (i3 > 0) {
                messageBarActionItemView.f32776a.setColorFilter(i3);
                return;
            }
            return;
        }
        int i4 = this.f202017i;
        if (i4 > 0) {
            messageBarActionItemView.f32776a.setColorFilter(i4);
        }
    }

    /* JADX INFO: renamed from: l */
    public yxy mo188528l(int i) {
        this.f202017i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public int m217745m(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: n */
    public yxy mo188529n(int i) {
        this.f202018j = i;
        return this;
    }

    public yxy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f202017i = -1;
        this.f202018j = -1;
        this.f202019k = -1;
        this.f202020l = -1;
    }
}
