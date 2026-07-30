package com.bytedance.bpea.entry.api.p011ve;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.common.BPEACertAuthEntry;
import com.momo.mcamera.util.MDLogTag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry;", "", "()V", "AudioRecord", MDLogTag.MOMENT_CAMERA_TAG, "MediaRecorder", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class VEPrivacyCertCheckEntry {

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$AudioRecord;", "", "()V", "Companion", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public static final class AudioRecord {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String RELEASE_AUDIO_RECORD = "audio_release";

        @NotNull
        public static final String START_AUDIO_RECORD = "audio_start";

        @NotNull
        public static final String STOP_AUDIO_RECORD = "audio_stop";

        @JvmStatic
        public static final void release(@Nullable Cert cert) throws BPEAException {
            INSTANCE.release(cert);
        }

        @JvmStatic
        public static final void start(@Nullable Cert cert) throws BPEAException {
            INSTANCE.start(cert);
        }

        @JvmStatic
        public static final void stop(@Nullable Cert cert) throws BPEAException {
            INSTANCE.stop(cert);
        }

        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$AudioRecord$Companion;", "", "()V", "RELEASE_AUDIO_RECORD", "", "START_AUDIO_RECORD", "STOP_AUDIO_RECORD", "release", "", "cert", "Lcom/bytedance/bpea/basics/Cert;", "start", "stop", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final void release(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkAudioCert(cert, AudioRecord.RELEASE_AUDIO_RECORD);
            }

            @JvmStatic
            public final void start(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkAudioCert(cert, AudioRecord.START_AUDIO_RECORD);
            }

            @JvmStatic
            public final void stop(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkAudioCert(cert, AudioRecord.STOP_AUDIO_RECORD);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$Camera;", "", "()V", "Companion", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public static final class Camera {

        @NotNull
        public static final String CLOSE_CAMERA = "camera_close";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String OPEN_CAMERA = "camera_open";

        @JvmStatic
        public static final void close(@Nullable Cert cert) throws BPEAException {
            INSTANCE.close(cert);
        }

        @JvmStatic
        public static final void open(@Nullable Cert cert) throws BPEAException {
            INSTANCE.open(cert);
        }

        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$Camera$Companion;", "", "()V", "CLOSE_CAMERA", "", "OPEN_CAMERA", "close", "", "cert", "Lcom/bytedance/bpea/basics/Cert;", "open", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final void close(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkVideoCert(cert, Camera.CLOSE_CAMERA);
            }

            @JvmStatic
            public final void open(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkVideoCert(cert, Camera.OPEN_CAMERA);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$MediaRecorder;", "", "()V", "Companion", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public static final class MediaRecorder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String RELEASE_MEDIA_RECORDER = "mediaRecord_release";

        @NotNull
        public static final String START_MEDIA_RECORDER = "mediaRecord_start";

        @NotNull
        public static final String STOP_MEDIA_RECORDER = "mediaRecord_stop";

        @JvmStatic
        public static final void release(@Nullable Cert cert) throws BPEAException {
            INSTANCE.release(cert);
        }

        @JvmStatic
        public static final void start(@Nullable Cert cert) throws BPEAException {
            INSTANCE.start(cert);
        }

        @JvmStatic
        public static final void stop(@Nullable Cert cert) throws BPEAException {
            INSTANCE.stop(cert);
        }

        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m87232d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$MediaRecorder$Companion;", "", "()V", "RELEASE_MEDIA_RECORDER", "", "START_MEDIA_RECORDER", "STOP_MEDIA_RECORDER", "release", "", "cert", "Lcom/bytedance/bpea/basics/Cert;", "start", "stop", "ve-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final void release(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkMediaRecorderCert(cert, MediaRecorder.RELEASE_MEDIA_RECORDER);
            }

            @JvmStatic
            public final void start(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkMediaRecorderCert(cert, MediaRecorder.START_MEDIA_RECORDER);
            }

            @JvmStatic
            public final void stop(@Nullable Cert cert) throws BPEAException {
                BPEACertAuthEntry.INSTANCE.checkMediaRecorderCert(cert, MediaRecorder.STOP_MEDIA_RECORDER);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
