package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\n"}, m88121d2 = {"Ll/fae;", "Ll/fyl;", "downloader", "<init>", "(Ll/fyl;)V", "a", "Ll/fyl;", "getDownloader", "()Ll/fyl;", "setDownloader", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class fae implements fyl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public fyl downloader;

    public fae(@Nullable fyl fylVar) {
        this.downloader = fylVar;
        if (fylVar == null) {
            this.downloader = new ynd();
        }
    }
}
