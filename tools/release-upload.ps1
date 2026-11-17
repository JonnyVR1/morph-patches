param([Parameter(Mandatory=$true)][string]$token)
$ErrorActionPreference = 'Stop'
$headers = @{ Authorization = "token $token" }
$repo = 'JonnyVR1/morph-patches'
$releaseId = '441228387'
$apiBase = "https://api.github.com/repos/$repo/releases/$releaseId"
$uploadBase = "https://uploads.github.com/repos/$repo/releases/$releaseId/assets"
$targets = @('patches-0.0.1-dev2.mpp', 'patches-list.json', 'patches-bundle.json')

$assets = Invoke-RestMethod -Uri "$apiBase/assets?per_page=100" -Headers $headers
foreach ($a in $assets) {
    if ($targets -contains $a.name) {
        Invoke-RestMethod -Method Delete -Uri "https://api.github.com/repos/$repo/releases/assets/$($a.id)" -Headers $headers | Out-Null
        Write-Output ("DELETED " + $a.name + " (id=" + $a.id + ", oldsize=" + $a.size + ")")
    }
}

function Upload-Asset($file, $name, $ctype) {
    $uri = $uploadBase + '?name=' + [uri]::EscapeDataString($name)
    $resp = Invoke-RestMethod -Method Post -Uri $uri -Headers $headers -ContentType $ctype -InFile $file
    Write-Output ("UPLOADED " + $resp.name + " size=" + $resp.size + " state=" + $resp.state)
}

Upload-Asset 'patches\build\libs\patches-0.0.1-dev2.mpp' 'patches-0.0.1-dev2.mpp' 'application/octet-stream'
Upload-Asset 'patches-list.json' 'patches-list.json' 'application/json'
Upload-Asset 'patches-bundle.json' 'patches-bundle.json' 'application/json'

Write-Output '--- VERIFY ---'
$verify = Invoke-RestMethod -Uri "$apiBase/assets?per_page=100" -Headers $headers
foreach ($a in $verify) { Write-Output ("ASSET " + $a.name + " size=" + $a.size + " state=" + $a.state) }
Write-Output 'RELEASE_DONE'
