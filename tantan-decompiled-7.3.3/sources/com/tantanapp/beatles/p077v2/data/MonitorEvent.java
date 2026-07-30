package com.tantanapp.beatles.p077v2.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.k5f;
import p153l.p8c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class MonitorEvent {
    private App app;
    private transient String cacheDir;

    @SerializedName("client_time")
    private String clientTime;
    private transient Thread crashThread;
    private Device device;
    private String env;

    @SerializedName("event_id")
    private String eventId;
    private transient List<k5f> eventProcessors;

    @SerializedName("event_type")
    private String eventType;
    private List<MonitorException> exceptions;
    private Map<String, String> extra;
    private transient List<File> files;
    private String format;
    private transient boolean isCache;
    private transient boolean isEmergency;

    @SerializedName("mapping_files")
    private List<String> mappingFiles;
    private transient boolean needLogcatProcessor;
    private transient boolean needOtherThread;
    private transient String newExceptiontype;

    /* JADX INFO: renamed from: os */
    private OperatingSystem f56854os;
    private String platform;
    private Sdk sdk;

    @SerializedName("sub_event_type")
    private String subEventType;
    private HashMap<String, String> tags;
    private List<MonitorThread> threads;

    @Nullable
    protected transient Throwable throwable;
    private String transaction;
    private User user;

    public MonitorEvent(@NonNull EventId eventId, String str) {
        this.eventProcessors = new CopyOnWriteArrayList();
        this.eventId = eventId.toString();
        this.clientTime = str;
    }

    public void addFile(File file) {
        if (this.files == null) {
            this.files = new ArrayList();
        }
        this.files.add(file);
    }

    public void addFiles(ArrayList<File> arrayList) {
        if (this.files == null) {
            this.files = new ArrayList();
        }
        this.files.addAll(arrayList);
    }

    public void addProcessor(k5f k5fVar) {
        this.eventProcessors.add(k5fVar);
    }

    public void addProcessors(List<k5f> list) {
        this.eventProcessors.addAll(list);
    }

    public App getApp() {
        return this.app;
    }

    public String getCacheDir() {
        return this.cacheDir;
    }

    public String getClientTime() {
        return this.clientTime;
    }

    public Thread getCrashThread() {
        return this.crashThread;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getEnvironment() {
        return this.env;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<k5f> getEventProcessors() {
        return this.eventProcessors;
    }

    public String getEventType() {
        return this.eventType;
    }

    public List<MonitorException> getExceptions() {
        return this.exceptions;
    }

    public Map<String, String> getExtra() {
        return this.extra;
    }

    @Nullable
    public List<File> getFiles() {
        return this.files;
    }

    public String getFormat() {
        return this.format;
    }

    public List<String> getMappingFiles() {
        return this.mappingFiles;
    }

    public String getNewExceptionType() {
        return this.newExceptiontype;
    }

    public OperatingSystem getOs() {
        return this.f56854os;
    }

    public String getPlatform() {
        return this.platform;
    }

    public Sdk getSdk() {
        return this.sdk;
    }

    public String getSubEventType() {
        return this.subEventType;
    }

    @Nullable
    public String getTag(@NonNull String str) {
        HashMap<String, String> map = this.tags;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<MonitorThread> getThreads() {
        return this.threads;
    }

    @Nullable
    public Throwable getThrowable() {
        return this.throwable;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public boolean isEmergency() {
        return this.isEmergency;
    }

    public boolean isNeedLogcatProcessor() {
        return this.needLogcatProcessor;
    }

    public boolean isNeedOtherThread() {
        return this.needOtherThread;
    }

    public boolean needSendSync() {
        return !this.isCache && this.isEmergency;
    }

    public void removeExtra(@NonNull String str) {
        Map<String, String> map = this.extra;
        if (map != null) {
            map.remove(str);
        }
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setCache(boolean z) {
        this.isCache = z;
    }

    public void setCacheDir(String str) {
        this.cacheDir = str;
    }

    public void setClientTime(String str) {
        this.clientTime = str;
    }

    public void setCrashThread(Thread thread) {
        this.crashThread = thread;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setEmergency(boolean z) {
        this.isEmergency = z;
    }

    public void setEnvironment(String str) {
        this.env = str;
    }

    public void setEventId(@NonNull EventId eventId) {
        this.eventId = eventId.toString();
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setExceptions(List<MonitorException> list) {
        this.exceptions = list;
    }

    public void setExtra(String str, String str2) {
        if (this.extra == null) {
            this.extra = new HashMap();
        }
        this.extra.put(str, str2);
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setMappingFiles(List<String> list) {
        this.mappingFiles = list;
    }

    public void setNeedLogcatProcessor(boolean z) {
        this.needLogcatProcessor = z;
    }

    public void setNeedOtherThread(boolean z) {
        this.needOtherThread = z;
    }

    public void setNewExceptionType(String str) {
        this.newExceptiontype = str;
    }

    public void setOs(OperatingSystem operatingSystem) {
        this.f56854os = operatingSystem;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setSdk(Sdk sdk) {
        this.sdk = sdk;
    }

    public void setSubEventType(String str) {
        this.subEventType = str;
    }

    public void setTag(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(str, str2);
    }

    public void setThreads(List<MonitorThread> list) {
        this.threads = list;
    }

    public void setThrowable(@Nullable Throwable th) {
        this.throwable = th;
    }

    public void setTransaction(String str) {
        this.transaction = str;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MonitorEvent() {
        this(new EventId(), p8c.m171234e(System.currentTimeMillis()));
    }

    public MonitorEvent(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        this();
        this.eventType = str;
        this.subEventType = str2;
        this.throwable = th;
    }
}
