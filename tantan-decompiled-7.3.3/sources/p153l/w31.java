package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w31 implements k5f {

    /* JADX INFO: renamed from: a */
    public final v31 f187051a;

    public w31(v31 v31Var) {
        this.f187051a = v31Var;
    }

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(@NonNull MonitorEvent monitorEvent) {
        List<File> files = monitorEvent.getFiles();
        if (files != null) {
            f610.m124264b("AttachmentsProcessor process start! files size:" + files.size() + " event type:" + monitorEvent.getEventType(), new Object[0]);
        } else {
            f610.m124264b("AttachmentsProcessor process start! file is null!!!", new Object[0]);
        }
        if (files != null) {
            this.f187051a.m199173n(files, monitorEvent);
        }
    }
}
